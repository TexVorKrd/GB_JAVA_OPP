package mvc;

import mvc.Controler.ConsoleConrtolerImpl;
import mvc.Model.Drinks.DrinkCold;
import mvc.Model.Drinks.DrinksList;
import mvc.Model.VM.VendingMachine;
import mvc.Servise.DrinkService.DrinkListServises;
import mvc.Servise.DrinkService.DrinkServisces;
import mvc.Servise.VMService.VmServisesImpl;
import mvc.View.ConcoleVieverImpl;

public class Main {

    public static void main(String[] args) {

        ConsoleConrtolerImpl conrtoler=new ConsoleConrtolerImpl(createData(),new VmServisesImpl(),new ConcoleVieverImpl());
        conrtoler.luncher();

    }

    private static VendingMachine createData(){
        DrinkServisces drinkServisces=new DrinkServisces();

        DrinkCold dc1 = new DrinkCold("Кола",75.0,0.5);
        DrinkCold dc2 = new DrinkCold("Пепси",90.0,0.7);
        DrinkCold dc3 = new DrinkCold("Фанта",100.0,0.75);
        DrinkCold dc4 = new DrinkCold("Спрайт",85.0,0.3);
        DrinkCold dc5 = new DrinkCold("7UP",80.0,0.6);

        DrinkListServises drinkListServises= new DrinkListServises();

        DrinksList forLoad = new DrinksList();

        drinkListServises.add(forLoad,dc1,8);
        drinkListServises.add(forLoad,dc2,15);
        drinkListServises.add(forLoad,dc3,12);
        drinkListServises.add(forLoad,dc4,1);
        drinkListServises.add(forLoad,dc5,3);


        VendingMachine myVM=new VendingMachine();
        VmServisesImpl vmServises = new VmServisesImpl();

        vmServises.load(myVM,forLoad.getDrinks());
        return myVM;
    }


  
}
