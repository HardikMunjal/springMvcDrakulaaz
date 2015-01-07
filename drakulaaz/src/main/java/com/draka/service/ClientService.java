package com.draka.service;

import java.util.List;

import com.draka.domain.Client;

public interface ClientService {
	public void saveClient ( Client client );
	public List<Client> getClient();
	
	//public List<Client> getOneClient();
	public Client getClient2(int id);
}