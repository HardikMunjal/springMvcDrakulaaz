package com.draka.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usersAuthorizedRole")
public class AuthorizedUserRole {


	@Id
	 @GeneratedValue
	 @Column(name = "user_role_id")
	 private int id;
 


 @Column(name = "username")
 private String username;


 @Column(name = "userrole")
 private String userrole;





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


public String getUserrole() {
	return userrole;
}


public void setUserrole(String userrole) {
	this.userrole = userrole;
}


 
 
}
