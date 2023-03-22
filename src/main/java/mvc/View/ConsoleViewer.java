package mvc.View;

import mvc.Model.Drinks.Drink;

import java.util.Map;

public interface ConsoleViewer {

    boolean showMenu(Map<Drink, Integer> storage);

    Drink selectDrinkForSale(Map<Drink, Integer> storage);

    boolean showStorage(Map<Drink, Integer> storage);

    boolean showSaleInfo(Map<Drink, Integer> storage);

}
