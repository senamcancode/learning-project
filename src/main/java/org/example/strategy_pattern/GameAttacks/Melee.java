package org.example.strategy_pattern.GameAttacks;

public class Melee implements AttackStrategy {
    public void attack(){
        System.out.println("Melee Attack");
    }
}
