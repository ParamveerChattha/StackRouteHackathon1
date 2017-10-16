package com.stackroute.hackathon.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.hackathon.domain.User;
@Repository
//Crud Interface. cused in UserServiceImp 
public interface UserRepository extends CrudRepository<User,Integer>
{

}
