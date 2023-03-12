package hw3;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ListOfDogs listOfDogs=new ListOfDogs();
        listOfDogs.add(new Dog("Шарик",2,12D));
        listOfDogs.add(new Dog("Бобик",3,14D));
        listOfDogs.add(new Dog("Жучка",7,5D));

        listOfDogs.print();

        System.out.println("\nСтандартная сортировка из Класса (По имени)\n");
        listOfDogs.sort();
        listOfDogs.print();

        System.out.println("\nCортировка по весу через компаратор (По весу) \n");

        Comparator<Dog> dogByWeigth=new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return o1.getWeigth().compareTo(o2.getWeigth());
            }
        };

        listOfDogs.sort(dogByWeigth);
        listOfDogs.print();

        System.out.println("\nCортировка по возласту передаем лямбду (По возрасту) \n");

        listOfDogs.sort((a,b)->a.getAge()<b.getAge()?-1:a.getAge()==b.getAge()?0:1);
        listOfDogs.print1();

    }
}
