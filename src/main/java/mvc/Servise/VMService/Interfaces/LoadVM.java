package mvc.Servise.VMService.Interfaces;

import mvc.Model.Drinks.Drink;
import mvc.Model.VM.VendingMachine;

import java.util.List;

public interface LoadVM {
    void load(VendingMachine vm, List<Drink> loadingDrinks);
}
