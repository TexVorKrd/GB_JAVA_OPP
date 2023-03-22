package mvc.Servise.VMService.Interfaces;

import mvc.Model.Drinks.Drink;
import mvc.Model.VM.VendingMachine;

import java.util.Map;

public interface GetStorageVmInfo {
    Map<Drink,Integer> storageInfo (VendingMachine vm);
}
