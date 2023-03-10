package org.example.seminar2;

public class Main {
    public static void main(String[] args) {

        Human human = new Human();
        human.name = "Vlad";

        Market market = new Market();

        market.acceptToMarket(human);
        market.takeInQueue(human);
        market.giveOrder();
        market.takeOrder();
        market.releaseFromQueue();
        market.releaseFromMarket(human);
        market.update();
    }
}
