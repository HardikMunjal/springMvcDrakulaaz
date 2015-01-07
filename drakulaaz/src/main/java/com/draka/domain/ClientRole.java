package com.draka.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.apache.commons.lang.builder.ToStringBuilder;

@Entity
@Table(name = "ClientRole")
public class ClientRole {


	@Id
	 @GeneratedValue
	 @Column(name = "client_role_id")
	 private int id;
 
	//@OneToOne(mappedBy="ClientRole1") 
	 //private Client client;

	@OneToOne
	@JoinColumn(name="client_id")
	private Client client;
	
	
	
	

 @Column(name = "userrole")
 private String userrole;
 
 @Column(name = "username")
 private String username;

 //public Question()  
 //{  
 //}  
   
 //public Question(int QUESTION_ID, String QUESTION, Survey survey )  
 //{  
  //super();  
  //this.QUESTION_ID = QUESTION_ID;  
  //this.QUESTION = QUESTION;  
  //this.survey = survey;  
 //}  
    
 


@Override  
  public String toString()  
  {  
   return ToStringBuilder.reflectionToString(this);  
  } 


 public int getId() {
	 return id;
	 }


	 public void setId(int id) {
	 this.id = id;

	 }


	 public Client getClient() {  
		   return client;  
		  }  
		  
		  public void setClient(Client client) {  
		   this.client = client;  
		  } 


public String getUserrole() {
	return userrole;
}


public void setUserrole(String userrole) {
	this.userrole = userrole;
}

public String getUsername() {
	return username;
}


public void setUsername(String username) {
	this.username = username;
}
 
 
}
