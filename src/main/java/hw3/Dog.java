package hw3;

import lombok.Getter;

import java.util.Comparator;
import java.util.Objects;

@Getter
public class Dog implements Comparable<Dog>, Comparator<Dog> {
    protected String name;
    protected Integer age;
    protected Double weigth;

    public Dog(String name, Integer age, Double weigth) {
        this.name = name;
        this.age = age;
        this.weigth = weigth;
    }

    @Override
    public int compareTo(Dog o) {
        return name.compareTo(o.name);
    }

    @Override
    public int compare(Dog o1, Dog o2) {
        return o1.compareTo(o2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name) &&
                Objects.equals(age, dog.age) &&
                Objects.equals(weigth, dog.weigth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, weigth);
    }
}
