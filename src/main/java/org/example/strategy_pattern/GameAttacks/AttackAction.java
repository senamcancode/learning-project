package org.example.strategy_pattern.GameAttacks;

public class AttackAction {
    private AttackStrategy strategy;

    public void setStrategy(AttackStrategy strategy){
        this.strategy = strategy;
    }

    public void executeAttack(){
        strategy.attack();
    }
}
