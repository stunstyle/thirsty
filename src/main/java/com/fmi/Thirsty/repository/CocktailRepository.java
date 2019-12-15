package com.fmi.Thirsty.repository;

import com.fmi.Thirsty.model.Cocktail;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface CocktailRepository extends MongoRepository<Cocktail, String>
{
    Cocktail findByName(String name);

    @Query("{name : { $regex: ?0} }")
    List<Cocktail> findCocktailByNameRegex(String regex);

    List<Cocktail> findByNameIn(List<String> names);

    List<Cocktail> findByIsCustomIsTrue();
}
