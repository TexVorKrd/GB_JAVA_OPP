package Generiks.Drinks;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Getter
public class DrinksList<T extends Drink> implements Iterable {
    List<T> drinksList;

    public DrinksList() {
        this.drinksList = new ArrayList<T>();
    }

    public void add(List<T> addingDrinksList) {
        for (T drink : addingDrinksList) {
            add(drink);
        }
    }

    private void add(T element) {
        drinksList.add(element);
    }

    public void add(T element, int count) {
        for (int i = 0; i < count; i++) {
            add(element);
        }
    }

    @Override
    public Iterator iterator() {
        return new DrinkListIterator(drinksList);
    }
}
