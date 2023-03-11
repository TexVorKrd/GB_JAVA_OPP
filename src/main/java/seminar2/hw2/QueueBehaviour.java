package seminar2.hw2;

public interface QueueBehaviour {

    void takeInQueue(Buyer actor);

    void takeOrder();

    void giveOrder();

    void releaseFromQueue();
}

