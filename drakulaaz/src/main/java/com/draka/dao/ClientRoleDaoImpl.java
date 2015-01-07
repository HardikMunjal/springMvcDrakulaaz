package com.draka.dao;  
  
import java.util.List;  

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Repository;  

import com.draka.domain.Client;  
import com.draka.domain.ClientRole;
  
  
@Repository("ClientRoleDao")  
public class ClientRoleDaoImpl implements ClientRoleDao {  
  
  
    @Autowired  
    private SessionFactory sessionfactory;  
  
  
    @Override  
    @Transactional  
    public void saveClientRole(ClientRole ClientRole) {  
        sessionfactory.getCurrentSession().saveOrUpdate(ClientRole);  
    }  
  
  
    
  
}  