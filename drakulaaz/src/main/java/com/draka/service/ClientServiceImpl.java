package com.draka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.draka.dao.ClientDao;
import com.draka.domain.Client;



@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ClientServiceImpl implements ClientService {


@Autowired
ClientDao ClientDao;



@Override
public void saveClient(Client Client) {
	// TODO Auto-generated method stub
	ClientDao.saveClient(Client);
	
}


@Override
public List<Client> getClient() {
	// TODO Auto-generated method stub
	return ClientDao.getClient();
}


@Override  
public Client getClient2(int id) {  
	 return ClientDao.getClient2(id);
} 
}
