package com.draka.dao;  
  
import java.util.List;  

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Repository;  

import com.draka.domain.Client;  
  
  
@Repository("ClientDao")  
public class ClientDaoImpl implements ClientDao {  
  
  
    @Autowired  
    private SessionFactory sessionfactory;  
  
  
    @Override  
    @Transactional  
    public void saveClient(Client Client) {  
        sessionfactory.getCurrentSession().saveOrUpdate(Client);  
    }  
  
    @Override  
    @Transactional  
    public List<Client> getOneClient() {  
    	List<Client> clientlist2= sessionfactory.getCurrentSession().createQuery("from Client where name like '%hardik%'").list();
    	 return clientlist2; 
    } 
    
    //List<Continent> theAmericas = session.createQuery(
//"from Continent where name like '%America%'")
//.list();
    
    @Override  
    @Transactional  
    public List<Client> getClient() {  
  
        @SuppressWarnings("unchecked")  
        List<Client> clientlist = sessionfactory.getCurrentSession()  
                .createCriteria(Client.class).list();
        
        return clientlist;  
  
    }  
  
    @Override
    @Transactional 
      public Client getClient2(int id) {
      Client client = (Client)sessionfactory.getCurrentSession().createQuery("from Client b where b.id = :bookId").setParameter("bookId", '1').list();
      return client;
    }
    
    
    
}  