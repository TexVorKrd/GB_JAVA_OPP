package hw3;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

@Getter
public class ListOfDogs implements Iterable<Dog> {
    protected List<Dog> dogsList;

    public ListOfDogs() {
        this.dogsList = new ArrayList<Dog>();
    }

    public void sort() {
        sort(Dog::compareTo);
    }

    public void sort(Comparator<Dog> comparator) {
        dogsList.sort(comparator);
    }

    @Override
    public Iterator<Dog> iterator() {
        return new ListOfDogsIterator(dogsList);
    }

    public void print() {
        for (Dog dog : dogsList) {
            System.out.printf(" %s %d лет, %.2f кг\n", dog.name, dog.age, dog.weigth);
        }
    }

    public void print1() {
        Iterator<Dog> dogIterator = new ListOfDogsIterator(this.dogsList);
        Dog dog;
        while (dogIterator.hasNext()) {
            dog = dogIterator.next();
            System.out.printf(" %s %d лет, %.2f кг\n", dog.name, dog.age, dog.weigth);
        }

    }

    public void add(Dog dog) {
        dogsList.add(dog);
    }
}
