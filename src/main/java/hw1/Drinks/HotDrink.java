package hw1.Drinks;

import hw1.prodproterty.ColdDrinkNames;
import hw1.prodproterty.DrinkVoluveSize;
import hw1.prodproterty.DrinksWaigth;
import hw1.prodproterty.HotDrinkNames;
import lombok.Getter;

@Getter
public class HotDrink extends ColdDrink{

    Double tp;
    /**
     * Создаем экземпляр написка
     *
     * @param volue  - объем
     * @param weigth - вес
     * @param name   - цазвание
     * @param price  - цена
     */
    public HotDrink(DrinkVoluveSize volue, DrinksWaigth weigth, HotDrinkNames name, Double price,Double tp) {

        super(volue, weigth, ColdDrinkNames.RedBull, price);
        super.volue=volue.getVolue();
        super.name=name.getName();
        super.weigth=weigth.getWeigth();
        super.price=price;
        this.tp=tp;

    }



    @Override
    public String getInfo() {
        return new StringBuilder().append(super.getInfo())
                .append(" : t = ")
                .append(tp)
                .append(" гр.")
                .toString().replace("Холодный напиток","Горячий напиток");
    }
}
