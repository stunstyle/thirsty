package com.fmi.Thirsty;

import com.fmi.Thirsty.repository.CocktailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThirstyApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(ThirstyApplication.class, args);

    }

}
