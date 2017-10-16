package com.stackroute.hackathon.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User 
// User's structure as to be stored in DB.
{
	@Id
 private int id;
 private String name;
 private String address;
 private String email;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
}
