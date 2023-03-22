package mvc.Model.Drinks;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public abstract class Drink {
    private String name;
    private Double price;
    private Double volue;

    public Drink(String name, Double price, Double volue) {
        this.name = name;
        this.price = price;
        this.volue = volue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Drink)) return false;
        Drink drink = (Drink) o;
        return Objects.equals(name, drink.name) &&
                Objects.equals(price, drink.price) &&
                Objects.equals(volue, drink.volue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, volue);
    }
}
