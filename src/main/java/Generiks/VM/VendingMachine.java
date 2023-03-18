package Generiks.VM;

import Generiks.Drinks.Drink;
import Generiks.Drinks.DrinksList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class VendingMachine<T extends Drink> {

    private Map<T, Integer> storage;
    private Map<T, Integer> saleinfo;

    private void add(T drink) {
        Integer sum = storage.getOrDefault(drink, 0) + 1;
        storage.put(drink, sum);
    }

    public VendingMachine() {
        this.storage = new HashMap<>();
        this.saleinfo = new HashMap<>();
    }

    public void load(DrinksList<T> drinkList) {
        Iterator<T> iterator = drinkList.iterator();
        while (iterator.hasNext()) {
            add(iterator.next());
        }
    }

    public void sellDrink(T drink) {

        Integer count = storage.getOrDefault(drink, -1);
        if (count == -1) return;
        saleinfo.put(drink, saleinfo.getOrDefault(drink, 0) + 1);
        count--;
        if (count == 0) {
            storage.remove(drink);
        } else {
            storage.put(drink, count);
        }
    }

    public Map<T, Integer> getListStorage() {
        return storage;
    }

    public Map<T, Integer> salesListStorage() {
        return saleinfo;
    }
}
