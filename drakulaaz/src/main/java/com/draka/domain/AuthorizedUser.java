package com.draka.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "usersAuthorized")
public class AuthorizedUser {


	 @Id
	 @Column(name = "user_id")
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private int id;
 


 @Column(name = "username")
 private String username;


 @Column(name = "password")
 private String password;


 @Column(name = "enabled")
 private int enabled;



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


 
}

