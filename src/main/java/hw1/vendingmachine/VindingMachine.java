package hw1.vendingmachine;

/**
 * Торговый автомат
 */
public abstract class VindingMachine implements VendingMachInteterfeces {

    // Сумма выручки
    int totalSales;

    /**
     * Вывод информациио выручке
     *
     * @return
     */
    public int saleValue() {
        return totalSales;
    }
}
