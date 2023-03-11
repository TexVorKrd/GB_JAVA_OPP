package seminar2.hw2;

import java.util.*;

public class Market implements MarketBehaviour,QueueBehaviour{

    List<Buyer> actors = new LinkedList<>();
    Deque<Buyer> buyers = new ArrayDeque<>();

    @Override
    public void update(Buyer actor) {
        acceptToMarket(actor);
        takeInQueue(actor);
        giveOrder();
        takeOrder();
        releaseFromQueue();
        releaseFromMarket(actor);

    }

    @Override
    public void acceptToMarket(Buyer actors) {
        this.actors.add(actors);
        System.out.printf("Посетитель %s зашел в магазин\n",actors.getName());
    }

    @Override
    public void releaseFromMarket(Buyer actor) {
        System.out.printf("Посетитель %s  вышел из магазина\n",actor.getName());
        actors.remove(actor);
    }


    @Override
    public void takeInQueue(Buyer actor) {
        System.out.printf("Покупатель %s стал в очередь\n",actor.getName());
        buyers.addLast(actor);
    }


    @Override
    public void releaseFromQueue() {
        Buyer actor =buyers.poll();
        System.out.printf("Покупатель %s вышел из очереди\n",actor.getName());

    }


    @Override
    public void takeOrder() {
        Buyer actor =buyers.peek();
        System.out.printf("Покупатель %s получил заказ\n",actor.getName());
        buyers.peek().isMakeOrder();

    }

    @Override
    public void giveOrder() {
        Buyer actor =buyers.peek();
        System.out.printf("Покупатель %s разместил заказ\n",actor.getName());
        buyers.peek().isMakeOrder();

    }



}
