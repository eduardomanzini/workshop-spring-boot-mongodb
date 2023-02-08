package com.nelioalves.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import com.nelioalves.workshopmongo.domain.User;

@Component
public interface UserRepository extends MongoRepository<User, String> {

}
