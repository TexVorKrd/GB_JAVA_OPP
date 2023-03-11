package hw1.Prodacts.Drinks.HotDrinks;
import hw1.Prodacts.Drinks.ColdDrinks.ColdDrinksList;
import hw1.Prodacts.Drinks.Drink;

import java.util.HashMap;
import java.util.Map;

public class HotDrinkList extends ColdDrinksList {

    protected Map<HotDrink, Integer> storage;

    public HotDrinkList(Map<HotDrink, Integer> list) {
        this.storage = list;
    }

    public HotDrinkList() {
        this.storage = new HashMap<>();
    }

    @Override
    public void add(Drink drink, int count) {
        if (drink instanceof HotDrink) {

            if (this.storage.containsKey(drink)) {
                this.storage.put((HotDrink) drink, storage.get(drink) + count);
            } else {
                this.storage.put((HotDrink) drink, count);
            }
        }
    }

    @Override
    public void remote(Drink drink, int count) {
        if (drink instanceof HotDrink) {

            if (this.storage.containsKey(drink)) {
                if (this.storage.get(drink) < count) {
                    this.storage.remove(drink);
                } else {
                    this.storage.put((HotDrink) drink, storage.get(drink) - count);
                }
            } else {
                this.storage.put((HotDrink) drink, count);
            }
        }
    }

    @Override
    public void getInfo() {
        System.out.println("\nИМЕЮТСЯ СЛЕДУЮЩИЕ НАПИТКИ\n");
        for (HotDrink key : this.storage.keySet()) {
            System.out.println("[" + key.getInfo() + " - " + this.storage.get(key) + " штук ]");
        }
    }

}
