package hw1.Prodacts.Drinks.ColdDrinks;

import hw1.Prodacts.Drinks.Drink;
import hw1.Prodacts.Drinks.ColdDrinks.properties.ColdDrinkNames;
import hw1.Prodacts.Drinks.properties.DrinkVoluveSize;
import hw1.Prodacts.Drinks.properties.DrinksWaigth;

public class ColdDrink extends Drink {


    public ColdDrink(DrinkVoluveSize volue, DrinksWaigth weigth, ColdDrinkNames name, Double price) {

        super(volue.getVolue(), weigth.getWeigth(), name.getName(), price);

    }

    /**
     * Вывод информации о продукте
     * @return - Описание
     */
    @Override
    public String getInfo() {

        return new StringBuilder()
                .append("Холодный напиток - ")
                .append(super.name)
                .append("[Вес - ")
                .append(super.weigth)
                .append("; ")
                .append("Объем - ")
                .append(super.volue)
                .append(" ] : цена ")
                .append(super.price)
                .append("руб. ")
                .toString();
    }


    /**
     * Генерит случайный товар
     * @return
     */
    public static ColdDrink CreateRandome() {

        DrinkVoluveSize rndValue = DrinkVoluveSize.values()[(int) (Math.random() * DrinkVoluveSize.values().length)];

        DrinksWaigth rndWaigth = DrinksWaigth.values()[(int) (Math.random() * DrinksWaigth.values().length)];

        ColdDrinkNames rndName = ColdDrinkNames.values()[(int) (Math.random() * ColdDrinkNames.values().length)];

        Double rndPrice = (Double) 500.0 + 50.0 * (int) (Math.random() * 5);

        return new ColdDrink(rndValue, rndWaigth, rndName, rndPrice);

    }
}
