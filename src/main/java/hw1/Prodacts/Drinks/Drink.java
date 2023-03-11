package hw1.Prodacts.Drinks;

import hw1.Prodacts.Product;
import lombok.Getter;

import java.util.Objects;

@Getter

public abstract class Drink extends Product {

    //Объем в литрах
    protected Double volue;

    //Вес в кг.
    protected Double weigth;

    /**
     * Напиток
     *
     * @param volue  - объем
     * @param weigth - вес
     * @param name   - название
     * @param price  - цена
     */
    public Drink(Double volue, Double weigth, String name, Double price) {

        super(name, price);
        this.volue = volue;
        this.weigth = weigth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Drink)) return false;
        if (!super.equals(o)) return false;
        Drink drink = (Drink) o;
        return Objects.equals(volue, drink.volue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), volue);
    }

//    @Override
//    public int compareTo(Product o) {
//        return super.compareTo(o);
//    }


        @Override
    public int compareTo (Product drink) {
            System.out.println(("Drink"));

        if (super.compareTo(drink)!=0) return super.compareTo(drink);
        if (drink instanceof Drink){
            if (volue.compareTo(((Drink) drink).volue) != 0) return volue.compareTo(((Drink) drink).volue);
            return weigth.compareTo(((Drink)drink).weigth);
        }
        return 0;


    }
}
