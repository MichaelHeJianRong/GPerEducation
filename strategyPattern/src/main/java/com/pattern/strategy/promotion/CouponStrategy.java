package com.pattern.strategy.promotion;

public class CouponStrategy implements IPromotionStrategy {

    @Override
    public void promote() {
        System.out.println("Use Coupon for promotion.");
    }
}
