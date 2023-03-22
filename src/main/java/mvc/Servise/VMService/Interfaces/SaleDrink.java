package mvc.Servise.VMService.Interfaces;

import mvc.Model.Drinks.Drink;
import mvc.Model.VM.VendingMachine;

public interface SaleDrink {
    boolean sale (Drink drink, VendingMachine vm);
}
