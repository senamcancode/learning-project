package org.example.strategy_pattern.DiscountStrategy;

public class SeasonalDiscount implements DiscountStrategy{
    public double price(double a){
        return a - (a * 0.20);
    }
}
