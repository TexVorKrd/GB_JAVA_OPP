package mvc.Servise.DrinkService;

import mvc.Model.Drinks.Drink;
import mvc.Model.Drinks.DrinksList;

public interface AddDrinks {
    void add(DrinksList drinksList, Drink drink, Integer count);
}
