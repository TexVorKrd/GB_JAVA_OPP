package hw1.Drinks;

import lombok.Getter;

import java.util.*;

@Getter
public abstract class  DrinkList {
    HashMap<Drink,Integer> storage;


    public DrinkList(HashMap<Drink,Integer> list) {
        this.storage = list;
    }
    public DrinkList() {
        this.storage = new HashMap<>();
    }

    public abstract void add (Drink drink,Integer count);
    public abstract void remote (Drink drink,Integer count);
    public abstract void getInfo ();
    public abstract Product getProduct (int id);






}
