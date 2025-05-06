package org.example.strategy_pattern.TravelRoute;

public class Bike implements TravelStrategy {
    public int calculateTime(int distance){
        System.out.println("Travelling by bike");
        return 10 * distance;
    }
}
