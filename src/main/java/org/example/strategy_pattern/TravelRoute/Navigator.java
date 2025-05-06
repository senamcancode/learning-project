package org.example.strategy_pattern.TravelRoute;

public class Navigator {
    private TravelStrategy strategy;

    public void setStrategy(TravelStrategy strategy){
        this.strategy = strategy;
    }

    public int executeTravel(int distance){
        return strategy.calculateTime(distance);
    }
}
