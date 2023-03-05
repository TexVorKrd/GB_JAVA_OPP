package hw1;

import hw1.Drinks.ColdDrink;
import hw1.Drinks.ColdDrinksList;
import hw1.Drinks.HotDrink;
import hw1.prodproterty.ColdDrinkNames;
import hw1.prodproterty.DrinkVoluveSize;
import hw1.prodproterty.DrinksWaigth;
import hw1.prodproterty.HotDrinkNames;
import hw1.vendingmachine.VmHotDrink;

public class Main {
    public static void main(String[] args) {


        VmHotDrink vwh = new VmHotDrink();

        vwh.load(createMixDrinkList());
        vwh.getStorageInfo();

        System.out.println("\n\n---Демо продаж ---");

        vwh.sellProdact(vwh.getStorage().getProduct(1));
        vwh.sellProdact(vwh.getStorage().getProduct(2));

        vwh.getStorageInfo();
        vwh.SellInfo();
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
