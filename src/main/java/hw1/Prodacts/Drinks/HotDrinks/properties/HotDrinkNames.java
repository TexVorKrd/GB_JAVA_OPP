package hw1.Prodacts.Drinks.HotDrinks.properties;

/**
 * Список названий горячих напитков
 */
public enum HotDrinkNames {
    Late("Лате"), GreenTee("Зеленый чай"), BlackTee("Черный чай"), Capuchino("Капучино");

    String name;

    HotDrinkNames(String volue) {
        this.name = volue;
    }

    public String getName() {
        return name;
    }
}
