package com.draka.dao;

import java.util.List;

import com.draka.domain.Client;
//import com.draka.domain.User;


public interface ClientDao {
public void saveClient ( Client Client );
public List<Client> getClient();
public List<Client> getOneClient();
public Client getClient2(int id);
}

