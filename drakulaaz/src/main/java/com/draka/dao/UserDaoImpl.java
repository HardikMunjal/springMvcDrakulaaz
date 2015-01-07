package com.draka.dao;  
  
import java.util.List;  

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Repository;  

import com.draka.domain.User;  
  
  
@Repository("userDao")  
public class UserDaoImpl implements UserDao {  
  
  
    @Autowired  
    private SessionFactory sessionfactory;  
  
  
    @Override  
    @Transactional  
    public void saveUser(User user) {  
        sessionfactory.getCurrentSession().saveOrUpdate(user);  
    }  
  
  
    @Override  
    @Transactional  
    public List<User> getUser() {  
  
        @SuppressWarnings("unchecked")  
        List<User> userlist = sessionfactory.getCurrentSession()  
                .createCriteria(User.class).list();
        
        return userlist;  
  
    }  
  
}  