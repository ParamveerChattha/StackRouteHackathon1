package com.stackroute.hackathon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.hackathon.domain.User;
import com.stackroute.hackathon.service.UserService;

@RestController
public class UserController 
{
	@Autowired
	UserService userservice;
	
	@RequestMapping(method=RequestMethod.GET , value="/getall")
	public ResponseEntity<List<User>> getAllUsers()
	{
		List<User> user=userservice.getAllUsers();
		return ResponseEntity.ok(user);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/create")
	public ResponseEntity<String> create(@RequestBody User user)
	{
		userservice.create(user);
		String create= "Users saved Successfully";
		return ResponseEntity.ok(create);
	}

	@RequestMapping(method=RequestMethod.DELETE , value="/delete")
	public ResponseEntity<String> delete(@RequestBody User user)
	{
		String delete=userservice.delete(user);
		return ResponseEntity.ok(delete);
	}
	@RequestMapping(method=RequestMethod.PUT, value="update")
	public ResponseEntity<User> update(@RequestBody User user)
	{
		User update=userservice.update(user);
		return ResponseEntity.ok(update);
	}

	
}
