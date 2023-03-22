package mvc.Servise.VMService.Interfaces;

import mvc.Model.Drinks.Drink;
import mvc.Model.VM.VendingMachine;

import java.util.Map;

public interface GetSaleVmInfo {
    Map<Drink,Integer> saleInfo (VendingMachine vm);
}
