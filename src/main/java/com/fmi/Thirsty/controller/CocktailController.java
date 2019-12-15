package com.fmi.Thirsty.controller;

import com.fmi.Thirsty.model.Drink;
import com.fmi.Thirsty.model.ApiCocktailWrapper;
import com.fmi.Thirsty.model.Cocktail;
import com.fmi.Thirsty.repository.CocktailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
public class CocktailController
{

    @Autowired
    CocktailRepository cocktailRepository;

    @GetMapping(path = "/cocktail/get")
    public List<Cocktail> getCocktail()
    {
        return cocktailRepository.findAll();
    }

    @PostMapping(path = "/cocktail/add", consumes = "application/json")
    public Cocktail createCocktail(@RequestBody Cocktail cocktail)
    {
        return cocktailRepository.save(cocktail);
    }

    @GetMapping(path = "/cocktail/names")
    public List<Cocktail> getCocktailsByNames(@RequestBody List<String> names)
    {
        return cocktailRepository.findByNameIn(names);
    }

    @GetMapping(path = "/cocktail/custom")
    public List<Cocktail> getCustomCocktails()
    {
        return cocktailRepository.findByIsCustomIsTrue();
    }

    @GetMapping(path = "/cocktail/name")
    public List<Cocktail> getApiCocktailsByName(@RequestParam(name = "name") String name)
    {
        Map<String, String> parameters = new HashMap<>();
        parameters.put("s", name);

        RestTemplate restTemplate = new RestTemplate();

        ApiCocktailWrapper response = restTemplate.getForObject(
                "https://www.thecocktaildb.com/api/json/v1/1/search.php?s=margarita", ApiCocktailWrapper.class);

        if (response != null)
        {
            return response.getCocktails().stream().map(Drink::toCocktail).collect(Collectors.toList());
        }

        return null;
    }


}
