package com.stackroute.hackathon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.stackroute.hackathon.domain.User;
import com.stackroute.hackathon.exception.UserAlreadyExistException;
import com.stackroute.hackathon.exception.UserDoesNotExistException;
import com.stackroute.hackathon.repository.UserRepository;
@Component
public class UserServiceImpl implements UserService
{
	//UserRepository is interface which has extended Crud to use Crud Methods
	@Autowired
	UserRepository userrepository;
	
	@Override
	// exception handling @ Method level if adding duplicate user
	public User create(User user) throws UserAlreadyExistException {
		//Checking existing user from db. findOne is inbuilt function of Crud
	User existeduser=userrepository.findOne(user.getId());
	//checking match
	if(existeduser != null) {
		//error message if user matches
		throw new UserAlreadyExistException("User Already exist");
	}else {
		//user created if it does not already exist
	User created = userrepository.save(user);
		return created;
	}
	}

	@Override
	//Handling exception if quering user which does not exist
	public String update(User user) throws UserDoesNotExistException {
		//using findOne method of Crud. will return 1 if user exists
		User existeduser=userrepository.findOne(user.getId());
		//condition-
		if(existeduser == null )
		{
			//error exception
			throw new UserDoesNotExistException("User does not exist");
		}else {
		//User update = userrepository.save(user);
		return "User Updated Successfully";
		}
	}

	@Override
	//deleting the existing user
	public String delete(User user) {
		 userrepository.delete(user);
		return "Data Deleted Successfully";
	}

	@Override
	//quering the existing users
	public List<User> getAllUsers() {
		
		
		return (List<User>) userrepository.findAll();
	}

	@Override
	//quering the result based  upon Id as asked by user
	public User getById(int id) {
		User user=userrepository.findOne(id);
		return user;
	}

	
}
