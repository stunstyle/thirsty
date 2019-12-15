package com.fmi.Thirsty;

import com.fmi.Thirsty.model.User;
import com.fmi.Thirsty.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
