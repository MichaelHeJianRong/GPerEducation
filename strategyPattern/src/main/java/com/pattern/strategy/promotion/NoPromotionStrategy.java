package com.pattern.strategy.promotion;

public class NoPromotionStrategy implements IPromotionStrategy {
    @Override
    public void promote() {
        System.out.println("No Promotion");
    }
}
