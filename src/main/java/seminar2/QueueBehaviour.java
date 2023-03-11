package seminar2;

public interface QueueBehaviour {

    void takeInQueue(Buyer actor);

    void takeOrder();

    void giveOrder();

    void releaseFromQueue();
}

