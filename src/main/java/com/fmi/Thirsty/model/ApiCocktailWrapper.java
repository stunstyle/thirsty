package com.fmi.Thirsty.model;

import java.util.List;

public class ApiCocktailWrapper
{
    private List<Drink> drinks;

    public List<Drink> getCocktails()
    {
        return drinks;
    }

    public void setCocktails(List<Drink> cocktails)
    {
        this.drinks = cocktails;
    }
}
