package mvc.View;

import mvc.Model.Drinks.Drink;

import java.util.Map;

public interface ConsoleViewer {

    MenuSelector askFromMenu();

    Drink selectDrinkForSale(Map<Drink, Integer> storage);

    void showStorage(Map<Drink, Integer> storage);

    void showSaleInfo(Map<Drink, Integer> storage);

}
