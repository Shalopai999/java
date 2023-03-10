package org.example.seminar2;

public interface QueueBehavior {
    void takeInQueue(Buyer actor);
    void giveOrder();
    void takeOrder();
    void releaseFromQueue();
}
