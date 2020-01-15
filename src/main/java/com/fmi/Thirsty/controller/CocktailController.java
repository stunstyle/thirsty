package com.fmi.Thirsty.controller;

import com.fmi.Thirsty.model.Drink;
import com.fmi.Thirsty.model.ApiCocktailWrapper;
import com.fmi.Thirsty.model.Cocktail;
import com.fmi.Thirsty.model.User;
import com.fmi.Thirsty.repository.CocktailRepository;
import com.fmi.Thirsty.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.*;
import java.util.stream.Collectors;

@RestController
public class CocktailController
{

    @Autowired
    CocktailRepository cocktailRepository;

    @Autowired
    UserRepository userRepository;

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

    @GetMapping(path = "/cocktail/top")
    public List<Map.Entry<String, Integer>> getTopCocktails()
    {
        List<User> users = userRepository.findAll();

        Map<String, Integer> top = new HashMap<>();

        for (User user : users)
        {
            List<String> cocktails = user.getSavedCocktail();
            if (cocktails != null)
            {
                for (String cocktail : cocktails)
                {
                    if (top.containsKey(cocktail))
                    {
                        top.put(cocktail, top.get(cocktail) + 1);
                    }
                    else
                    {
                        top.put(cocktail, 1);
                    }
                }
            }
        }

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(top.entrySet());

        entries.sort(Comparator.comparingInt(Map.Entry::getValue));

        return entries;
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
