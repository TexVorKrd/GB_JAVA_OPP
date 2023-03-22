package mvc.Model.VM;

import lombok.Getter;
import lombok.Setter;
import mvc.Model.Drinks.Drink;


import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class VendingMachine {
    private Map<Drink, Integer> storage;
    private Map<Drink, Integer> saleInfo;
    private Double moneySum;

    public VendingMachine() {
        storage = new HashMap<>();
        saleInfo = new HashMap<>();
        moneySum = 0D;
    }
}
