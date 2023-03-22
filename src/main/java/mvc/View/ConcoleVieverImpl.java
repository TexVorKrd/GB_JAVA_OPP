package mvc.View;

import mvc.Model.Drinks.Drink;


import java.util.Map;
import java.util.Scanner;


public class ConcoleVieverImpl implements ConsoleViewer {

    @Override
    public MenuSelector askFromMenu() {
        String selection;

        while (true) {
            System.out.println("\n ВЫБЕРИТЕ ПУНКТ \n");
            for (MenuSelector mc : MenuSelector.values()) {
                System.out.println(mc.toString());
            }
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n -------- \n");
            selection = scanner.nextLine();

            for (MenuSelector mc : MenuSelector.values()) {
                if (mc.getId().equals(selection)) return mc;
            }
            System.out.println("----------------");
            System.out.println("ВЫБОР НЕВЕРНЫЙ");
            System.out.println("----------------");
        }

    }

    @Override
    public Drink selectDrinkForSale(Map<Drink, Integer> storage) {
        System.out.println("==========");
        System.out.println("ПРОДАЖА ТОВАРА");
        System.out.println("==========");
        return null;

    }

    @Override
    public void showStorage(Map<Drink, Integer> storage) {
        System.out.println("==========");
        System.out.println("ИНФОРМАЦИЯ О НАЛИЧИИ ТОВАРА");
        System.out.println("==========");
    }

    @Override
    public void showSaleInfo(Map<Drink, Integer> storage) {
        System.out.println("==========");
        System.out.println("ИНФОРМАЦИЯ О ПРОДАЖАХ");
        System.out.println("==========");
    }
}
