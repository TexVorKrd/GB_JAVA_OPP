package hw1;

import hw1.Prodacts.Drinks.ColdDrinks.ColdDrink;
import hw1.Prodacts.Drinks.ColdDrinks.ColdDrinksList;
import hw1.Prodacts.Drinks.Drink;
import hw1.Prodacts.Drinks.HotDrinks.HotDrink;
import hw1.Prodacts.Drinks.ColdDrinks.properties.ColdDrinkNames;
import hw1.Prodacts.Drinks.properties.DrinkVoluveSize;
import hw1.Prodacts.Drinks.properties.DrinksWaigth;
import hw1.Prodacts.Drinks.HotDrinks.properties.HotDrinkNames;
import hw1.Prodacts.Product;
import hw1.vendingmachine.VmHotDrink;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        HotDrink hd1 = new HotDrink(DrinkVoluveSize.SMALL, DrinksWaigth.CASE1, HotDrinkNames.Late, 100.0, 40.);
        HotDrink hd2 = new HotDrink(DrinkVoluveSize.SMALL, DrinksWaigth.CASE2, HotDrinkNames.BlackTee, 110.0, 30.);
        HotDrink hd3 = new HotDrink(DrinkVoluveSize.SMALL, DrinksWaigth.CASE1, HotDrinkNames.Capuchino, 100.0, 30.);
        ColdDrink cd1 = new ColdDrink(DrinkVoluveSize.MEDIUM, DrinksWaigth.CASE2, ColdDrinkNames.RedBull, 100.0);
        ColdDrink cd2 = new ColdDrink(DrinkVoluveSize.SMALL, DrinksWaigth.CASE1, ColdDrinkNames.RedBull, 80.0);
        ColdDrink d1 = new ColdDrink(DrinkVoluveSize.SMALL, DrinksWaigth.CASE2, ColdDrinkNames.Pepsi, 100.0);
        ColdDrink d2 = new ColdDrink(DrinkVoluveSize.MEDIUM, DrinksWaigth.CASE1, ColdDrinkNames.Pepsi, 80.0);

        ArrayList<ColdDrink> myList = new ArrayList<>();
        myList.add(hd1);
        myList.add(hd2);
        myList.add(hd3);
        myList.add(cd1);
        myList.add(cd2);
        myList.add(d2);
        myList.add(d1);

        for (Product a:myList) {
            System.out.println(a.getInfo());
        }

        System.out.println("-----");
        myList.sort(ColdDrink::compareTo);

        for (Product a:myList) {
            System.out.println(a.getInfo());
        }



    }

    /**
     * Генерация списка товаров. Смешаный для демонстрации фильтрации при загрузке автомата.
     * @return
     */
    public static ColdDrinksList createMixDrinkList() {

        HotDrink hd1 = new HotDrink(DrinkVoluveSize.SMALL, DrinksWaigth.CASE1, HotDrinkNames.Late, 100.0, 40.);
        HotDrink hd2 = new HotDrink(DrinkVoluveSize.SMALL, DrinksWaigth.CASE2, HotDrinkNames.BlackTee, 110.0, 30.);
        HotDrink hd3 = new HotDrink(DrinkVoluveSize.SMALL, DrinksWaigth.CASE1, HotDrinkNames.Capuchino, 100.0, 30.);
        ColdDrink cd1 = new ColdDrink(DrinkVoluveSize.SMALL, DrinksWaigth.CASE2, ColdDrinkNames.RedBull, 100.0);
        ColdDrink cd2 = new ColdDrink(DrinkVoluveSize.MEDIUM, DrinksWaigth.CASE1, ColdDrinkNames.CocaCola, 80.0);

        ColdDrinksList hdList = new ColdDrinksList();
        hdList.add(hd1, 3);
        hdList.add(hd2, 2);
        hdList.add(hd3, 1);
        hdList.add(cd1, 10);
        hdList.add(cd2, 5);

        return hdList;
    }
}
