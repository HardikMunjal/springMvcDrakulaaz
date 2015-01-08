package com.draka.domain.drakulaaz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Duser")
public class Duser {



 @Id
 @GeneratedValue
 @Column(name = "user_id")
 private int id;



 @Column(name = "first_name")
 private String firstName;


 @Column(name = "last_name")
 private String lastName;


 @Column(name = "gender")
 private String gender;



 @Column(name = "email")
 private String email;
 
 @Column(name = "password")
 private String password;


 public int getId() {
 return id;
 }


 public void setId(int id) {
 this.id = id;

 }


 public String getFirstName() {
 return firstName;

 }


 public void setFirstName(String firstName) {
 this.firstName = firstName;

 }


 public String getLastName() {
 return lastName;

 }


 public void setLastName(String lastName) {
 this.lastName = lastName;
 }


 public String getGender() {
 return gender;

 }


 public void setGender(String gender) {
 this.gender = gender;

 }


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}


 
}

