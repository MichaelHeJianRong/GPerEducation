package com.pattern.strategy.promotion;

public class DiscountStrategy implements IPromotionStrategy {


    @Override
    public void promote() {
        System.out.println("Discount promotion.");
    }
}
