package seminar2;

public abstract class Buyer implements BuyerBehavior{
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;
    abstract String getName();

}
