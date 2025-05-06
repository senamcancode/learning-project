package org.example.strategy_pattern.TravelRoute;

public class Car implements TravelStrategy{
    public int calculateTime(int distance){
        System.out.println("Travelling by Car");
        return 1 * distance;
    }
}
