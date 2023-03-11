package seminar2.hw2;

public interface MarketBehaviour {

    void acceptToMarket(Buyer actor);

    void releaseFromMarket(Buyer actor);

    void update (Buyer actor);

}
