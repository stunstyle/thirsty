package com.fmi.Thirsty;

import com.fmi.Thirsty.security.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ThirstyApplication {
    public static void main(String[] args) {
        SpringApplication.run(ThirstyApplication.class, args);
//        MongoClientURI uri = new MongoClientURI(
//            "mongodb+srv://user:user@karizma-3klyn.mongodb.net/test?retryWrites=true&w=majority");
//
//        MongoClient mongoClient = new MongoClient(uri);
//
//        MongoTemplate mongoTemplate = new MongoTemplate(mongoClient, "users");
//
//        mongoTemplate.insert(new User("karizma", "karizma", "karizma@karizma.com"));
//        mongoTemplate.insert(new User("valentin", "password", "valko1@payner.bg"));
    }
}

