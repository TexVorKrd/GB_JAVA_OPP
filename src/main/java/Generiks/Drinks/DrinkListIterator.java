package Generiks.Drinks;

import java.util.Iterator;
import java.util.List;

public class DrinkListIterator<T extends Drink> implements Iterator<T> {
    List<T> drinkList;
    int counter;

    public DrinkListIterator(List<T> drList) {
        this.drinkList = drList;
        this.counter = -1;
    }

    @Override
    public boolean hasNext() {
        return counter < drinkList.size() - 1;
    }

    @Override
    public T next() {
        if (!hasNext()) return null;
        counter++;
        return drinkList.get(counter);
    }
}
