package com.daily.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.daily.domain.User;

public interface UserRepository extends MongoRepository<User,String> {
}
