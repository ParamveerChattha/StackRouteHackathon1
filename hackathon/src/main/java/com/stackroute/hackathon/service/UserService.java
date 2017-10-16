package com.stackroute.hackathon.service;

import com.stackroute.hackathon.domain.User;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public interface UserService 
{
	
	public String create(User user);
	public User update(User user);
	public String delete(User user);
	public List<User> getAllUsers();

}
