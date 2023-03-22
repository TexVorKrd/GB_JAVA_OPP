package mvc.Model.Drinks;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class DrinksList {
    private ArrayList<Drink> drinks;

    public DrinksList() {
        this.drinks = new ArrayList<>();
    }
}
