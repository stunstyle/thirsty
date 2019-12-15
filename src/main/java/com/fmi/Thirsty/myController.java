package com.fmi.Thirsty;

import com.fmi.Thirsty.security.User;
import com.fmi.Thirsty.services.RegistrationService;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
class myController {

    @Autowired
    RegistrationService service;

    @GetMapping("/")
    String hello() {
        return "Hello there";
    }

    @GetMapping("/user/{username}")
    String testUser(@PathVariable String username) {
        return "What's up, " + username;
    }

    @GetMapping("/user/{username}/hello")
    String test(@PathVariable String username) {
        return "This is the hello page, " + username;
    }

    @PostMapping(value = "register/user", consumes = "application/json")
    String register(@RequestBody User user) {
        service.register(user);
        return "Registration done!";
    }

}
