package com.pattern.strategy.promotion;

public class PromotionStrategyTest {

    public static void main(String[] args) {

        String promotionKey = "DISCOUNT";

        PromotionActivity activity = new PromotionActivity(PromotionStrategyFactory.getPromotion(promotionKey));
        activity.run();

    }
}
