package mvc.Servise.DrinkService;

import mvc.Model.Drinks.Drink;
import mvc.Model.Drinks.DrinksList;

import java.util.ArrayList;

public class DrinkListServises implements AddDrinks {
    @Override
    public void add(DrinksList drinksList, Drink drink, Integer count) {
        ArrayList<Drink> drinks = drinksList.getDrinks();

        for (int i = 0; i < count; i++) {
            drinks.add(drink);
        }
        drinksList.setDrinks(drinks);
    }
}
