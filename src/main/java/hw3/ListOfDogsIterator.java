package hw3;

import java.util.Iterator;
import java.util.List;

public class ListOfDogsIterator implements Iterator<Dog> {

    private List<Dog> dogs;
    private Integer counter = 0;

    public ListOfDogsIterator(List<Dog> dogList) {
        this.dogs = dogList;
    }

    @Override
    public boolean hasNext() {
        return counter < dogs.size();
    }

    @Override
    public Dog next() {
        if (!hasNext()) return null;
        return dogs.get(counter++);
    }
}
