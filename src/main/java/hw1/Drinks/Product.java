package hw1.Drinks;

import lombok.Getter;

@Getter
public abstract class Product implements Comparable {

    //Имя Товара
    protected String name;

    //Цена
    protected Double price;

    /**
     * Создаем экземпляр Продукта
     *
     * @param name  - Наименование
     * @param price - Цена
     */
    protected Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    //Информация о товаре
    public abstract String getInfo();

    @Override
    public int compareTo(Object o) {
        return name.compareTo(((Product) o).getName());
    }
}
