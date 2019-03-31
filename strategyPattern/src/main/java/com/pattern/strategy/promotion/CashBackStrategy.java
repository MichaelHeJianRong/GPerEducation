package com.pattern.strategy.promotion;

public class CashBackStrategy implements IPromotionStrategy {

    @Override
    public void promote() {
        System.out.println("Cash back promotion.");
    }
}
