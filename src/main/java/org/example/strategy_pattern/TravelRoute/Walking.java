package org.example.strategy_pattern.TravelRoute;

public class Walking implements TravelStrategy{
    public int calculateTime(int distance){
        System.out.println("Walking");
        return 100 * distance;
    };
}
