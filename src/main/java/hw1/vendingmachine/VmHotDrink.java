package hw1.vendingmachine;

import hw1.Prodacts.Drinks.*;
import hw1.Prodacts.Drinks.ColdDrinks.ColdDrink;
import hw1.Prodacts.Drinks.ColdDrinks.ColdDrinksList;
import hw1.Prodacts.Drinks.HotDrinks.HotDrink;
import hw1.Prodacts.Product;

public class VmHotDrink extends VmColdDrink {

    @Override
    public void sellProdact(Product product) {
        if (product instanceof HotDrink) {
            int counter = this.storage.getStorageColdDrinks().getOrDefault(product, 0);
            if (counter == 0) {
                System.out.println("Товар закончился");
                this.storage.getStorageColdDrinks().remove(product);
                return;
            }
            this.totalSales += product.getPrice();
            System.out.println("Продан товар - " + product.getInfo());
            if (counter == 1) {
                this.storage.getStorageColdDrinks().remove(product);
            } else {
                this.storage.getStorageColdDrinks().put((ColdDrink) product, counter - 1);
            }
        } else {
            System.out.println(" Этот товар не продается");
        }
    }

    @Override
    public void load(ColdDrinksList products) {
        System.out.println("Загрузка автомата");
        for (Product prod : products.getStorageColdDrinks().keySet()) {
            if (prod instanceof HotDrink) {
                storage.add((Drink) prod, products.getStorageColdDrinks().get(prod));
            } else {
                System.out.println("-- не подходит для этого торгового автомата - " + prod.getInfo());
            }
        }
        System.out.println("Загрузка завершена");
    }
}
