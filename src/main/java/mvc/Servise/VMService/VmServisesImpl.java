package mvc.Servise.VMService;

import mvc.Model.Drinks.Drink;
import mvc.Model.VM.VendingMachine;
import mvc.Servise.VMService.Interfaces.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class VmServisesImpl
        implements GetStorageVmInfo,
        GetSaleVmInfo,
        LoadVM,
        SaleDrink

{
    public VmServisesImpl() {
    }

    @Override
    public Map<Drink, Integer> storageInfo(VendingMachine vm) {
        if (vm==null) return null ;
        return vm.getStorage();
    }

    @Override
    public void load(VendingMachine vm, List<Drink> loadingDrinks) {
        if (loadingDrinks==null||vm==null) return;
        Map<Drink,Integer> vmStorage=vm.getStorage();
        for (Drink drink:loadingDrinks) {
            vmStorage.put(drink,vmStorage.getOrDefault(drink,0)+1);
        }
        vm.setStorage(vmStorage);
    }

    @Override
    public boolean sale(Drink drink, VendingMachine vm) {

        if (drink == null || vm == null) return false;

        Map<Drink, Integer> vmStorage = vm.getStorage();
        Map<Drink, Integer> vmSales = vm.getSaleInfo();

        if (vmStorage.getOrDefault(drink, -1) == -1) return false;

        vmStorage.put(drink, vmStorage.get(drink) - 1);
        if (vmStorage.get(drink) == 0) vmStorage.remove(drink);

        vmSales.put(drink, vmSales.getOrDefault(drink, 0) + 1);

        vm.setStorage(vmStorage);
        vm.setSaleInfo(vmSales);
        vm.setMoneySum(vm.getMoneySum() + drink.getPrice());
        return true;
    }

    @Override
    public Map<Drink, Integer> saleInfo(VendingMachine vm) {
        if (vm==null) return null ;
        return vm.getSaleInfo();
    }
}
