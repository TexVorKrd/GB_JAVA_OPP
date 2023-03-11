package hw1.Prodacts.Drinks.HotDrinks;

import hw1.Prodacts.Drinks.ColdDrinks.ColdDrink;
import hw1.Prodacts.Drinks.ColdDrinks.properties.ColdDrinkNames;
import hw1.Prodacts.Drinks.properties.DrinkVoluveSize;
import hw1.Prodacts.Drinks.properties.DrinksWaigth;
import hw1.Prodacts.Drinks.HotDrinks.properties.HotDrinkNames;
import hw1.Prodacts.Product;
import lombok.Getter;

@Getter
public class HotDrink extends ColdDrink {

    Double tp;

    @Override
    public int compareTo(Product drink) {
        System.out.println("Хот");
        return super.compareTo(drink);
    }

    public HotDrink(DrinkVoluveSize volue, DrinksWaigth weigth, HotDrinkNames name, Double price, Double tp) {

        super(volue, weigth, ColdDrinkNames.values()[0], price);
        super.name=name.getName();
        this.tp=tp;

    }

    @Override
    public String getInfo() {
        return new StringBuilder().append(super.getInfo())
                .append(" : t = ")
                .append(tp)
                .append(" гр.")
                .toString().replace("Холодный напиток","Горячий напиток");
    }
}
