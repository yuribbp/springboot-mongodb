package com.stscourse.springbootmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stscourse.springbootmongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

	
}