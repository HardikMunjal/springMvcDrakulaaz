package com.draka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.draka.dao.UserAuthorizedDao;

import com.draka.domain.AuthorizedUser;



@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UserAuthorizedServiceImpl implements UserAuthorizedService {


@Autowired
UserAuthorizedDao userAuthorizedDao;



@Override
public void saveAuthorizedUser(AuthorizedUser Authorizeduser) {
	// TODO Auto-generated method stub
	userAuthorizedDao.saveAuthorizedUser(Authorizeduser);
	
}


@Override
public List<AuthorizedUser> getAuthorizedUser() {
	// TODO Auto-generated method stub
	return userAuthorizedDao.getAuthorizedUser();
}
}
