package hw1.Drinks;

import java.util.HashMap;

public class ColdDrinksList extends DrinkList {

    protected HashMap<ColdDrink, Integer> storage;

    public ColdDrinksList(HashMap<ColdDrink, Integer> myStorage) {
        this.storage = myStorage;
    }

    public ColdDrinksList() {
        this.storage = new HashMap<>();
    }

    public HashMap<ColdDrink, Integer> getStorageColdDrinks() {
        return storage;
    }

    @Override
    public void add(Drink drink, Integer count) {
        if (storage.containsKey(drink)) {
            storage.put((ColdDrink) drink, storage.get(drink) + count);
        } else {
            storage.put((ColdDrink) drink, count);
        }
    }

    @Override
    public void remote(Drink drink, Integer count) {
        if (storage.containsKey(drink)) {
            if (storage.get(drink) < count) {
                storage.remove(drink);
            } else {
                storage.put((ColdDrink) drink, storage.get(drink) - count);
            }
        } else {
            storage.put((ColdDrink) drink, count);
        }
    }

    @Override
    public void getInfo() {
        System.out.println("\nИМЕЮТСЯ СЛЕДУЮЩИЕ НАПИТКИ\n");

        for (ColdDrink key : storage.keySet()) {
            System.out.println("[" + key.getInfo() + " - " + storage.get(key) + " штук ]");
        }
    }

    @Override
    public Product getProduct(int id) {
        int size = storage.keySet().toArray().length;
        if (id > size) return null;
        return (Product) storage.keySet().toArray()[id - 1];
    }
}
