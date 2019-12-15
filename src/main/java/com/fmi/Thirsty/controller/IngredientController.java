package com.fmi.Thirsty.controller;

import com.fmi.Thirsty.model.Ingredient;
import com.fmi.Thirsty.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class IngredientController
{
    @Autowired
    IngredientRepository repository;

    @GetMapping(path = "/ingredient/get")
    public Ingredient getIngredient(@RequestParam(name = "name") String name)
    {
        return repository.findByName(name);
    }

    @PostMapping(path = "ingredient/create")
    public Ingredient createIngredient(@RequestBody Ingredient ingredient)
    {
        return repository.save(ingredient);
    }
}