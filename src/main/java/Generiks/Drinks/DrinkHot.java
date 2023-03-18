package Generiks.Drinks;

import lombok.Getter;

@Getter
public class DrinkHot extends DrinkCold {

    private Double temperature;

    public DrinkHot(String name, Double price, Double volue, Double temperature) {
        super(name, price, volue);
        this.temperature = temperature;
    }

    @Override
    public String getInfo() {
        return new StringBuilder()
                .append(super.getInfo())
                .append(" Температура - ")
                .append(temperature)
                .toString();
    }

    public int compareTo(DrinkHot o) {
        if (compareTo((DrinkCold) o) != 0) return compareTo((DrinkCold) o);
        else return temperature.compareTo(o.getTemperature());
    }

    @Override
    public int compareTo(DrinkCold o) {

        return compareTo(o);
    }

    @Override
    public int compare(DrinkCold o1, DrinkCold o2) {
        return super.compare(o1, o2);
    }
}
