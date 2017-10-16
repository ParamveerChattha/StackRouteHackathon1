package com.stackroute.hackathon.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.hackathon.domain.User;
@Repository
//Crud repo extended by interface
public interface UserRepository extends CrudRepository<User,Integer>
{

}
