package com.draka.dao.drakulaaz;  
  
import java.util.List;  

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Repository;  

import com.draka.domain.drakulaaz.Duser;  
  
  
@Repository("DuserDao")  
public class DuserDaoImpl implements DuserDao {  
  
  
    @Autowired  
    private SessionFactory sessionfactory;  
  
  
    @Override  
    @Transactional  
    public void saveDuser(Duser duser) {  
        sessionfactory.getCurrentSession().saveOrUpdate(duser);  
    }  
  
  
    @Override  
    @Transactional  
    public List<Duser> getDuser() {  
  
        @SuppressWarnings("unchecked")  
        List<Duser> duserlist = sessionfactory.getCurrentSession()  
                .createCriteria(Duser.class).list();
        
        return duserlist;  
  
    }  
  
}  