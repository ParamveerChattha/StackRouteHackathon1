package com.stackroute.hackathon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.stackroute.hackathon.domain.User;
import com.stackroute.hackathon.repository.UserRepository;
@Component
public class UserServiceImpl implements UserService
{

	@Autowired
	UserRepository userrepository;
// Using Crud methods
	public String create(User user) {
		
	userrepository.save(user);
		return "Users saved Successfully";
	}

	public User update(User user) {
		User update = userrepository.save(user);
		return update;
	}

	public String delete(User user) {
		 userrepository.delete(user);
		return "Data deleted Successfully";
	}

	public List<User> getAllUsers() {
		
		
		return (List<User>) userrepository.findAll();
	}

	
}
