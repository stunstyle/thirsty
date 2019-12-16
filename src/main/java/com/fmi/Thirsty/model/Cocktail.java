package com.fmi.Thirsty.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "cocktails")
public class Cocktail
{
    @Id
    private String id;

    @Indexed(unique=true, sparse=true)
    private String name;

    private String alcohol;

    private String instruction;

    private String glass;

    private String imageLink;

    private List<String> ingredients;

    private List<String> quantity;

    private boolean isCustom;

    public Cocktail()
    {

    }

    public Cocktail(String name, String alcohol, String instruction, String glass, String imageLink, List<String> ingredients, List<String> quantity, boolean isCustom)
    {
        this.name = name;
        this.alcohol = alcohol;
        this.instruction = instruction;
        this.glass = glass;
        this.imageLink = imageLink;
        this.ingredients = ingredients;
        this.quantity = quantity;
        this.isCustom = isCustom;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAlcohol()
    {
        return alcohol;
    }

    public void setAlcohol(String alcohol)
    {
        this.alcohol = alcohol;
    }

    public String getInstruction()
    {
        return instruction;
    }

    public void setInstruction(String instruction)
    {
        this.instruction = instruction;
    }

    public String getGlass()
    {
        return glass;
    }

    public void setGlass(String glass)
    {
        this.glass = glass;
    }

    public String getImageLink()
    {
        return imageLink;
    }

    public void setImageLink(String imageLink)
    {
        this.imageLink = imageLink;
    }

    public List<String> getIngredients()
    {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients)
    {
        this.ingredients = ingredients;
    }

    public List<String> getQuantity()
    {
        return quantity;
    }

    public void setQuantity(List<String> quantity)
    {
        this.quantity = quantity;
    }

    public boolean isCustom()
    {
        return isCustom;
    }

    public void setCustom(boolean custom)
    {
        isCustom = custom;
    }

    @Override
    public String toString()
    {
        return "Cocktail{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", alcohol=" + alcohol +
                ", instruction='" + instruction + '\'' +
                ", glass='" + glass + '\'' +
                ", imageLink='" + imageLink + '\'' +
                ", ingredients=" + ingredients +
                ", quantity=" + quantity +
                ", isCustom=" + isCustom +
                '}';
    }
}
