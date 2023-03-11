package seminar2;

import java.util.*;

public class Market implements MarketBehaviour,QueueBehaviour{

    List<Buyer> actors = new LinkedList<>();
    Deque<Buyer> buyers = new ArrayDeque<>();

    @Override
    public void acceptToMarket(Buyer actors) {
        this.actors.add(actors);

    }

    @Override
    public void releaseFromMarket(Buyer actor) {
        actors.remove(actor);

    }


    @Override
    public void takeInQueue(Buyer actor) {
        buyers.addLast(actor);

    }
    @Override
    public void releaseFromQueue() {
        buyers.poll();

    }


    @Override
    public void takeOrder() {
        buyers.peek().isMakeOrder();


    }

    @Override
    public void giveOrder() {
        buyers.peek().isMakeOrder();

    }


}
