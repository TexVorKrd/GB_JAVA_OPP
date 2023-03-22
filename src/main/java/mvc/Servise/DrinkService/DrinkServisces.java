package mvc.Servise.DrinkService;

import mvc.Model.Drinks.Drink;

public class DrinkServisces implements GetInfo {

    public DrinkServisces() {
    }

    @Override
    public String getInfo(Drink drink) {
        return new StringBuilder()
                .append("Напиток - ")
                .append(drink.getName())
                .append("; ")
                .append("Объем - ")
                .append(drink.getVolue())
                .append("  : цена ")
                .append(drink.getPrice())
                .append("руб. ")
                .toString();
    }
}
