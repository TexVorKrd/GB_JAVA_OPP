package hw1.Prodacts.Drinks;

import hw1.Prodacts.Product;
import lombok.Getter;

import java.util.*;

@Getter
public abstract class  DrinkList {

    List<Drink> prodactsList;
    HashMap<Drink,Integer> storage;

    /**
     * Создается список напитков
     */
    public DrinkList() {
        this.storage = new HashMap<>();
        this.prodactsList=new LinkedList<>();
    }

    public abstract void add (Drink drink,int count);
    public abstract void remote (Drink drink,int count);
    public abstract void getInfo ();

    public abstract Product getProduct (int id);






}
