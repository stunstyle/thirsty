package com.fmi.Thirsty.repository;

import com.fmi.Thirsty.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String>
{
    public User findByUsername(String username);
}
