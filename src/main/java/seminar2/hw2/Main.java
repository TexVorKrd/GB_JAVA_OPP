package seminar2.hw2;

public class Main {
    public static void main(String[] args) {
        Buyer h1 = new Human("Павел");
        Market market=new Market();
        market.update(h1);
    }
}
