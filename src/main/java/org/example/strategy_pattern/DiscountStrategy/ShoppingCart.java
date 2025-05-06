package org.example.strategy_pattern.DiscountStrategy;

public class ShoppingCart {
    private DiscountStrategy strategy;

    public void setStrategy(DiscountStrategy strategy){
        this.strategy = strategy;
    };

    public double executeDiscount(double a){
        return strategy.price(a);
    }
}
