package com.draka.dao;  
  
import java.util.List;  

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Repository;  

import com.draka.domain.AuthorizedUser;  
  
  
@Repository("UserAuthorizedDao")  
public class UserAuthorizedDaoImpl implements UserAuthorizedDao {  
  
  
    @Autowired  
    private SessionFactory sessionfactory;  
  
  
    


	@Override
	@Transactional
	public void saveAuthorizedUser(AuthorizedUser Authorizeduser) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().saveOrUpdate(Authorizeduser);
	}


	@Override
	@Transactional
	public List<AuthorizedUser> getAuthorizedUser() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<AuthorizedUser> userlist = sessionfactory.getCurrentSession()  
                .createCriteria(AuthorizedUser.class).list();
		return null;
	}  
  
}  