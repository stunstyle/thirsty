package com.fmi.Thirsty.model;

import java.util.ArrayList;
import java.util.List;

public class Drink
{
    private String idDrink;

    private String strDrink;

    private String strDrinkAlternate;
    private String strDrinkES;
    private String strDrinkDE;
    private String strDrinkFR;
    private String strTags;
    private String strVideo;
    private String strCategory;
    private String strIBA;
    private String strAlcoholic;

    private String strGlass;

    private String strInstructions;

    private String strDrinkThumb;

    private String strIngredient1;
    private String strIngredient2;
    private String strIngredient3;
    private String strIngredient4;
    private String strIngredient5;
    private String strIngredient6;
    private String strIngredient7;
    private String strIngredient8;
    private String strIngredient9;
    private String strIngredient10;
    private String strIngredient11;
    private String strIngredient12;
    private String strIngredient13;
    private String strIngredient14;
    private String strIngredient15;

    private String strMeasure1;
    private String strMeasure2;
    private String strMeasure3;
    private String strMeasure4;
    private String strMeasure5;
    private String strMeasure6;
    private String strMeasure7;
    private String strMeasure8;
    private String strMeasure9;
    private String strMeasure10;
    private String strMeasure11;
    private String strMeasure12;
    private String strMeasure13;
    private String strMeasure14;
    private String strMeasure15;

    public Cocktail toCocktail()
    {
        List<String> ingredients = new ArrayList<>();
        List<String> quantity = new ArrayList<>();

        if (strIngredient1 != null)
        {
            ingredients.add(strIngredient1);
            quantity.add(strMeasure1);
        }
        if (strIngredient2 != null)
        {
            ingredients.add(strIngredient2);
            quantity.add(strMeasure2);
        }
        if (strIngredient3 != null)
        {
            ingredients.add(strIngredient3);
            quantity.add(strMeasure3);
        }
        if (strIngredient3 != null)
        {
            ingredients.add(strIngredient3);
            quantity.add(strMeasure3);
        }
        if (strIngredient4 != null)
        {
            ingredients.add(strIngredient4);
            quantity.add(strMeasure4);
        }
        if (strIngredient5 != null)
        {
            ingredients.add(strIngredient5);
            quantity.add(strMeasure5);
        }
        if (strIngredient6 != null)
        {
            ingredients.add(strIngredient6);
            quantity.add(strMeasure6);
        }
        if (strIngredient7 != null)
        {
            ingredients.add(strIngredient7);
            quantity.add(strMeasure7);
        }
        if (strIngredient8 != null)
        {
            ingredients.add(strIngredient8);
            quantity.add(strMeasure8);
        }
        if (strIngredient9 != null)
        {
            ingredients.add(strIngredient9);
            quantity.add(strMeasure9);
        }
        if (strIngredient10 != null)
        {
            ingredients.add(strIngredient10);
            quantity.add(strMeasure10);
        }
        if (strIngredient11 != null)
        {
            ingredients.add(strIngredient11);
            quantity.add(strMeasure11);
        }
        if (strIngredient12 != null)
        {
            ingredients.add(strIngredient12);
            quantity.add(strMeasure12);
        }
        if (strIngredient13 != null)
        {
            ingredients.add(strIngredient13);
            quantity.add(strMeasure13);
        }
        if (strIngredient14 != null)
        {
            ingredients.add(strIngredient14);
            quantity.add(strMeasure14);
        }
        if (strIngredient15 != null)
        {
            ingredients.add(strIngredient15);
            quantity.add(strMeasure15);
        }

        return new Cocktail(strDrink, strAlcoholic, strInstructions, strGlass, strDrinkThumb, ingredients, quantity, false);

    }

    public String getStrDrink()
    {
        return strDrink;
    }

    public void setStrDrink(String strDrink)
    {
        this.strDrink = strDrink;
    }

    public String getStrAlcoholic()
    {
        return strAlcoholic;
    }

    public void setStrAlcoholic(String strAlcoholic)
    {
        this.strAlcoholic = strAlcoholic;
    }

    public String getStrGlass()
    {
        return strGlass;
    }

    public void setStrGlass(String strGlass)
    {
        this.strGlass = strGlass;
    }

    public String getStrInstructions()
    {
        return strInstructions;
    }

    public void setStrInstructions(String strInstructions)
    {
        this.strInstructions = strInstructions;
    }

    public String getStrDrinkThumb()
    {
        return strDrinkThumb;
    }

    public void setStrDrinkThumb(String strDrinkThumb)
    {
        this.strDrinkThumb = strDrinkThumb;
    }

    public String getStrIngredient1()
    {
        return strIngredient1;
    }

    public void setStrIngredient1(String strIngredient1)
    {
        this.strIngredient1 = strIngredient1;
    }

    public String getStrIngredient2()
    {
        return strIngredient2;
    }

    public void setStrIngredient2(String strIngredient2)
    {
        this.strIngredient2 = strIngredient2;
    }

    public String getStrIngredient3()
    {
        return strIngredient3;
    }

    public void setStrIngredient3(String strIngredient3)
    {
        this.strIngredient3 = strIngredient3;
    }

    public String getStrIngredient4()
    {
        return strIngredient4;
    }

    public void setStrIngredient4(String strIngredient4)
    {
        this.strIngredient4 = strIngredient4;
    }

    public String getStrIngredient5()
    {
        return strIngredient5;
    }

    public void setStrIngredient5(String strIngredient5)
    {
        this.strIngredient5 = strIngredient5;
    }

    public String getStrIngredient6()
    {
        return strIngredient6;
    }

    public void setStrIngredient6(String strIngredient6)
    {
        this.strIngredient6 = strIngredient6;
    }

    public String getStrIngredient7()
    {
        return strIngredient7;
    }

    public void setStrIngredient7(String strIngredient7)
    {
        this.strIngredient7 = strIngredient7;
    }

    public String getStrIngredient8()
    {
        return strIngredient8;
    }

    public void setStrIngredient8(String strIngredient8)
    {
        this.strIngredient8 = strIngredient8;
    }

    public String getStrIngredient9()
    {
        return strIngredient9;
    }

    public void setStrIngredient9(String strIngredient9)
    {
        this.strIngredient9 = strIngredient9;
    }

    public String getStrIngredient10()
    {
        return strIngredient10;
    }

    public void setStrIngredient10(String strIngredient10)
    {
        this.strIngredient10 = strIngredient10;
    }

    public String getStrIngredient11()
    {
        return strIngredient11;
    }

    public void setStrIngredient11(String strIngredient11)
    {
        this.strIngredient11 = strIngredient11;
    }

    public String getStrIngredient12()
    {
        return strIngredient12;
    }

    public void setStrIngredient12(String strIngredient12)
    {
        this.strIngredient12 = strIngredient12;
    }

    public String getStrIngredient13()
    {
        return strIngredient13;
    }

    public void setStrIngredient13(String strIngredient13)
    {
        this.strIngredient13 = strIngredient13;
    }

    public String getStrIngredient14()
    {
        return strIngredient14;
    }

    public void setStrIngredient14(String strIngredient14)
    {
        this.strIngredient14 = strIngredient14;
    }

    public String getStrIngredient15()
    {
        return strIngredient15;
    }

    public void setStrIngredient15(String strIngredient15)
    {
        this.strIngredient15 = strIngredient15;
    }

    public String getStrMeasure1()
    {
        return strMeasure1;
    }

    public void setStrMeasure1(String strMeasure1)
    {
        this.strMeasure1 = strMeasure1;
    }

    public String getStrMeasure2()
    {
        return strMeasure2;
    }

    public void setStrMeasure2(String strMeasure2)
    {
        this.strMeasure2 = strMeasure2;
    }

    public String getStrMeasure3()
    {
        return strMeasure3;
    }

    public void setStrMeasure3(String strMeasure3)
    {
        this.strMeasure3 = strMeasure3;
    }

    public String getStrMeasure4()
    {
        return strMeasure4;
    }

    public void setStrMeasure4(String strMeasure4)
    {
        this.strMeasure4 = strMeasure4;
    }

    public String getStrMeasure5()
    {
        return strMeasure5;
    }

    public void setStrMeasure5(String strMeasure5)
    {
        this.strMeasure5 = strMeasure5;
    }

    public String getStrMeasure6()
    {
        return strMeasure6;
    }

    public void setStrMeasure6(String strMeasure6)
    {
        this.strMeasure6 = strMeasure6;
    }

    public String getStrMeasure7()
    {
        return strMeasure7;
    }

    public void setStrMeasure7(String strMeasure7)
    {
        this.strMeasure7 = strMeasure7;
    }

    public String getStrMeasure8()
    {
        return strMeasure8;
    }

    public void setStrMeasure8(String strMeasure8)
    {
        this.strMeasure8 = strMeasure8;
    }

    public String getStrMeasure9()
    {
        return strMeasure9;
    }

    public void setStrMeasure9(String strMeasure9)
    {
        this.strMeasure9 = strMeasure9;
    }

    public String getStrMeasure10()
    {
        return strMeasure10;
    }

    public void setStrMeasure10(String strMeasure10)
    {
        this.strMeasure10 = strMeasure10;
    }

    public String getStrMeasure11()
    {
        return strMeasure11;
    }

    public void setStrMeasure11(String strMeasure11)
    {
        this.strMeasure11 = strMeasure11;
    }

    public String getStrMeasure12()
    {
        return strMeasure12;
    }

    public void setStrMeasure12(String strMeasure12)
    {
        this.strMeasure12 = strMeasure12;
    }

    public String getStrMeasure13()
    {
        return strMeasure13;
    }

    public void setStrMeasure13(String strMeasure13)
    {
        this.strMeasure13 = strMeasure13;
    }

    public String getStrMeasure14()
    {
        return strMeasure14;
    }

    public void setStrMeasure14(String strMeasure14)
    {
        this.strMeasure14 = strMeasure14;
    }

    public String getStrMeasure15()
    {
        return strMeasure15;
    }

    public void setStrMeasure15(String strMeasure15)
    {
        this.strMeasure15 = strMeasure15;
    }

    public String getIdDrink()
    {
        return idDrink;
    }

    public void setIdDrink(String idDrink)
    {
        this.idDrink = idDrink;
    }

    public String getStrDrinkAlternate()
    {
        return strDrinkAlternate;
    }

    public void setStrDrinkAlternate(String strDrinkAlternate)
    {
        this.strDrinkAlternate = strDrinkAlternate;
    }

    public String getStrDrinkES()
    {
        return strDrinkES;
    }

    public void setStrDrinkES(String strDrinkES)
    {
        this.strDrinkES = strDrinkES;
    }

    public String getStrDrinkDE()
    {
        return strDrinkDE;
    }

    public void setStrDrinkDE(String strDrinkDE)
    {
        this.strDrinkDE = strDrinkDE;
    }

    public String getStrDrinkFR()
    {
        return strDrinkFR;
    }

    public void setStrDrinkFR(String strDrinkFR)
    {
        this.strDrinkFR = strDrinkFR;
    }

    public String getStrTags()
    {
        return strTags;
    }

    public void setStrTags(String strTags)
    {
        this.strTags = strTags;
    }

    public String getStrVideo()
    {
        return strVideo;
    }

    public void setStrVideo(String strVideo)
    {
        this.strVideo = strVideo;
    }

    public String getStrCategory()
    {
        return strCategory;
    }

    public void setStrCategory(String strCategory)
    {
        this.strCategory = strCategory;
    }

    public String getStrIBA()
    {
        return strIBA;
    }

    public void setStrIBA(String strIBA)
    {
        this.strIBA = strIBA;
    }
}
