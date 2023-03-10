package org.example.seminar2;

public interface MarketBehavior {
    void acceptToMarket(Buyer actor);
    void releaseFromMarket(Buyer actor);
    void update();
}
