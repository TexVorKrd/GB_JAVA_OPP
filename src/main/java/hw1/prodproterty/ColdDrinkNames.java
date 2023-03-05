package hw1.prodproterty;

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
