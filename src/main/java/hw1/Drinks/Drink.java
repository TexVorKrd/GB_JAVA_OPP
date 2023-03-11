package hw1.Drinks;

import lombok.Getter;

@Getter
public abstract class Drink extends Product {

    //Объем
    protected Double volue;

    //Вес
    protected Double weigth;

    /**
     * Создаем экземпляр написка
     *
     * @param volue  - объем
     * @param weigth - вес
     * @param name   - цазвание
     * @param price  - цена
     */
    public Drink(Double volue, Double weigth, String name, Double price) {

        super(name, price);
        this.volue = volue;
        this.weigth = weigth;
    }
}
