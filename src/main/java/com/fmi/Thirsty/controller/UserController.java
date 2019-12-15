package com.fmi.Thirsty.controller;

import com.fmi.Thirsty.model.User;
import com.fmi.Thirsty.repository.CocktailRepository;
import com.fmi.Thirsty.repository.UserRepository;
import com.fmi.Thirsty.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController("/")
class UserController
{

    @Autowired
    UserRepository userRepository;

    @Autowired
    CocktailRepository cocktailRepository;

    @Autowired
    RegistrationService service;

    @PostMapping(value = "register/user", consumes = "application/json")
    String register(@RequestBody User user)
    {
        service.register(user);
        return "Registration done!";
    }

    @PostMapping(path = "user/{username}/addFavorite")
    public User addFavorite(@RequestParam(name = "drink") String drink, @PathVariable(name = "username") String username)
    {
        if (cocktailRepository.findByName(drink) == null)
        {
            //TODO
        }

        User user = userRepository.findByUsername(username);

        if (user == null)
        {
            //TODO
        }

        if (user.getSavedCocktail() != null)
        {
            user.setSavedCocktail(Collections.singletonList(drink));
        }
        else
        {
            user.getSavedCocktail().add(drink);
        }
        return userRepository.save(user);
    }

    @GetMapping(path = "user/{username}/favorite")
    public List<String> getFavorites(@PathVariable String username)
    {
        return userRepository.findByUsername(username).getSavedCocktail();
    }

}
