package com.draka.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name = "client")
public class Client {


	 @Id
	 @Column(name = "client_id")
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private int id;
 


 @Column(name = "username")
 private String username;


 @Column(name = "password")
 private String password;
 
 


 @Column(name = "enabled")
 private int enabled;

 @Transient  
 private String ClientRole;  
 
// @OneToOne(cascade=CascadeType.ALL)
 //private ClientRole ClientRole1;
 
 @OneToOne (mappedBy="client")
 @JoinColumn(name = "client_id")
 private ClientRole clientrole;
 
 
 
 

 public int getId() {
	 return id;
	 }


	 public void setId(int id) {
	 this.id = id;

	 }


 public String getUsername() {
 return username;

 }


 public void setUsername(String username) {
 this.username = username;

 }


 public String getPassword() {
 return password;

 }


 public void setPassword(String password) {
 this.password = password;
 }


public int getEnabled() {
	return enabled;
}


public void setEnabled(int enabled) {
	this.enabled = enabled;
}

public String getClientRole() {  
	  return ClientRole;  
	 }  
	 public void setClientRole(String ClientRole) {  
	  this.ClientRole = ClientRole;  
	 }
 
}

