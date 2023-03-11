package hw1.vendingmachine;

import hw1.Prodacts.Product;

import java.util.Map;

public interface VendingMachInteterfeces {
    /**
     * Загрузка товаров в автомат
     *
     * @param products - Список товар/количество загружаемое в автомат
     */
    public void load(Map<Product, Integer> products);

    /**
     * Вывод информации о списке товаров
     */
    public void getStorageInfo();

    /**
     * Продажа одной единицы товара
     *
     * @param product
     */
    public void sellProdact(Product product);

    /**
     * Информация о сумме проданного товара
     */
    public void SellInfo();
}
