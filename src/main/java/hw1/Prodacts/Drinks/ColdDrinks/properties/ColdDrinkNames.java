package hw1.Prodacts.Drinks.ColdDrinks.properties;

import lombok.Getter;

/**
 * Список названий холодных напитков
 */
@Getter
public enum ColdDrinkNames {
    Pepsi("Пепси Кола"), CocaCola("Кока-Кола"), RedBull("Редбул"), OrangeJuce("Апельсиновый сок");

    String name;

    ColdDrinkNames(String volue) {
        this.name = volue;
    }
}
