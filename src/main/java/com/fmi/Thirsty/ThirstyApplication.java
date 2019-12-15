package com.fmi.Thirsty;

import com.fmi.Thirsty.repository.CocktailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThirstyApplication implements CommandLineRunner
{

    @Autowired
    CocktailRepository cocktailRepository;

    public static void main(String[] args)
    {
        SpringApplication.run(ThirstyApplication.class, args);

    }

	@Override
	public void run(String... args) throws Exception {
		addSampleData();
		getTheFuckers();
	}

    public void addSampleData()
    {
       /* System.out.println("da ta eba qko");
        cocktailRepository.save(new Cocktail("kosoko", 30, "ebe maiki","cocktail glass"
                ,"https://www.thecocktaildb.com/images/media/drink/wpxpvu1439905379.jpg",
                Collections.singletonList("voda"),Collections.singletonList("mnogo"),true));*/
    }

    public void getTheFuckers()
    {
		System.out.println("aide bebebebbebebebe");
		cocktailRepository.findAll().forEach(System.out::println);
    }

}
