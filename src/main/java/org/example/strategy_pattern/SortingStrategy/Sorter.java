package org.example.strategy_pattern.SortingStrategy;

public class Sorter {
    private SortingStrategy strategy;

    public void setStrategy(SortingStrategy strategy){
        this.strategy = strategy;
    }

    public void executeSort(int a, int b, int c){
        strategy.sort(a, b, c);
    }
}
