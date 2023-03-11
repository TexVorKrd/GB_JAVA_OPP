package hw1.Prodacts;

import lombok.Getter;

import java.util.Comparator;
import java.util.Objects;

@Getter

public abstract class Product implements Comparable<Product>, Comparator<Product>{

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Product o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public int compare(Product o1, Product o2) {
        System.out.println(("Prod"));
        return o1.compareTo(o2);
    }
}
