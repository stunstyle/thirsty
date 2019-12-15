package com.fmi.Thirsty.repository;

import com.fmi.Thirsty.model.Ingredient;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IngredientRepository extends MongoRepository<Ingredient, String>
{
    Ingredient findByName(String name);
}
