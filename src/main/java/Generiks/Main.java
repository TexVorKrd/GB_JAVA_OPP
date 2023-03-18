package Generiks;

import Generiks.Drinks.Drink;
import Generiks.Drinks.DrinkCold;
import Generiks.Drinks.DrinkHot;
import Generiks.Drinks.DrinksList;
import Generiks.VM.VendingMachine;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DrinkCold dc1 = new DrinkCold("Напиток 1",100D,0.5);
        DrinkCold dc2 = new DrinkCold("Напиток 2",50D,0.25);
        DrinkCold dc3 = new DrinkCold("Напиток 3",15D,0.75);
        DrinkCold dc4 = new DrinkCold("Напиток 4",200D,1.0);
        DrinkCold dc5 = new DrinkCold("Напиток 5",75D,0.5);

        DrinkHot dh1 = new DrinkHot("Горячий Напиток 1",100D,0.5,30d);
        DrinkHot dh2 = new DrinkHot("Горячий Напиток 2",50D,0.25,35d);
        DrinkHot dh3 = new DrinkHot("Горячий Напиток 3",15D,0.75,25d);
        DrinkHot dh4 = new DrinkHot("Горячий Напиток 4",200D,1.0,60d);
        DrinkHot dh5 = new DrinkHot("Горячий Напиток 5",75D,0.5,65d);

        DrinksList<DrinkCold> myDrinksCold= new DrinksList<>();
        myDrinksCold.add(List.of(dc1,dc2,dc3,dc4,dc5,dh1));

        DrinksList<DrinkHot> myDrinksHot= new DrinksList<>();
        myDrinksHot.add(List.of(dh1,dh2,dh3,dh4,dh5));
        myDrinksHot.add(dh1,20);
        myDrinksHot.add(dh3,15);
        myDrinksHot.add(dh5,14);

        VendingMachine<DrinkCold> vmDC = new VendingMachine<>();
        VendingMachine<DrinkHot> vmDH = new VendingMachine<>();

        vmDC.load(myDrinksCold);
        vmDH.load(myDrinksHot);

        for (Drink key:vmDH.getListStorage().keySet()) {
            System.out.print(key.getInfo());
            System.out.print(" кол-во: ");
            System.out.println(vmDH.getListStorage().get(key));
        }
        System.out.println("-".repeat(50));
        vmDH.sellDrink(dh1);
        vmDH.sellDrink(dh1);
        vmDH.sellDrink(dh3);
        vmDH.sellDrink(dh4);
        vmDH.sellDrink(dh5);

        for (Drink key:vmDH.getListStorage().keySet()) {
            System.out.print(key.getInfo());
            System.out.print(" кол-во: ");
            System.out.println(vmDH.getListStorage().get(key));
        }


    }
}
