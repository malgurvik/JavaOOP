package org.example.homework02;

public interface QueueBehaviour {
    void takeInQueue(Actor actor);
    void takeOrders();
    void waitOrder();
    void giveOrders();
    void releaseFromQueue();

}
