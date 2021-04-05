package com.user.micro.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.user.micro.entity.Users;

@Repository
public interface UserRepository extends MongoRepository<Users, String> {



	Users findByEmailAndPasswordAndRole(String email, String password, String role);

}
