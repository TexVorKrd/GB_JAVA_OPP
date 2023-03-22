package mvc.Model.Drinks;

import lombok.Getter;

import java.util.Comparator;

@Getter
public class DrinkCold extends Drink implements Comparable<DrinkCold>, Comparator<DrinkCold> {

    public DrinkCold(String name, Double price, Double volue) {
        super(name, price, volue);
    }

    @Override
    public int compareTo(DrinkCold o) {
        return this.getName().compareTo(o.getName());
    }

    @Override
    public int compare(DrinkCold o1, DrinkCold o2) {
        return o1.compareTo(o2);

    }
}
