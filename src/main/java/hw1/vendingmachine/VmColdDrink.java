package hw1.vendingmachine;

import hw1.Drinks.ColdDrink;
import hw1.Drinks.ColdDrinksList;
import hw1.Drinks.Drink;
import hw1.Drinks.Product;
import lombok.Getter;
import java.util.Map;

/**
 * Реализация торгового автомата Холодными напитками
 */
@Getter
public class VmColdDrink extends VindingMachine {

    // Список товаров
    protected ColdDrinksList storage;


    public VmColdDrink() {
        this.storage = new ColdDrinksList();
    }

    @Override
    public void load(Map<Product,Integer> products) {
        for (Product prod:products.keySet()) {
            if (prod instanceof ColdDrink){
                storage.add((Drink) prod,products.get(prod));
            }
            else {
                System.out.println(prod.getInfo()+" не подходит для этого торгового автомата");
            }
        }
    }

    /**
     * Загрузка автомата. Закгружается товар только из подходящего к этому автомату.
     * @param products - список загружаемых товаров
     */
    public void load(ColdDrinksList products) {
        for (Product prod:products.getStorageColdDrinks().keySet()) {
            if (prod instanceof ColdDrink){
                storage.add((Drink) prod,products.getStorageColdDrinks().get(prod));
            }
            else {
                System.out.println(prod.getInfo()+" не подходит для этого торгового автомата");
            }
        }
    }

    /**
     * Вывод информации об ассортименте
     */
    @Override
    public void getStorageInfo() {
        this.storage.getInfo();
    }

    /**
     * Реализация товара через автомат.
     *
     * @param product - продаваемый товар
     */
    @Override
    public void sellProdact(Product product) {
        System.out.println(product.getInfo());
        if (product instanceof ColdDrink){
            int counter =this.storage.getStorageColdDrinks().getOrDefault(product,0);
            if (counter==0){
                System.out.println("Товар закончился");
                this.storage.getStorageColdDrinks().remove(product);
                return;
            }
            this.totalSales+=product.getPrice();
            if (counter==1){
                this.storage.getStorageColdDrinks().remove(product);
            }
            else {
                this.storage.getStorageColdDrinks().put((ColdDrink) product, counter - 1);
            }
        }
        else {
            System.out.println(product.getInfo()+" Этот вид товара автомат не продает");
        }
    }

    /**
     * Информация о объеме продаж
     */
    @Override
    public void SellInfo() {

        System.out.println("\nВСЕГО ПРОДАЖ НА "+super.saleValue()+"\n");
    }


}
