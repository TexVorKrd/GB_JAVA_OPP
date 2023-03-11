package seminar2;

public class Human extends Buyer {
    @Override
    public void setMakeOrder() {
        super.isMakeOrder=true;

    }

    @Override
    public void setTakeOrder() {
        super.isTakeOrder=true;

    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeorder() {
        return isTakeOrder;
    }

    @Override
    String getName() {
        return null;
    }
}
