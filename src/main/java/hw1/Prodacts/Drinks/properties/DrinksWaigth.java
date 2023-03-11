package hw1.Prodacts.Drinks.properties;

import lombok.Getter;

/**
 * Список названий объема
 */
@Getter
public enum DrinksWaigth {
    CASE1(0.5), CASE2(0.6), CASE3(0.7), CASE4(0.8), CASE5(0.9);

    double weigth;

    DrinksWaigth(double weigth) {
        this.weigth = weigth;
    }
}
