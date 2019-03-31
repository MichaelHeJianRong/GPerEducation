package com.pattern.strategy.promotion;

public class PromotionActivity {

    private IPromotionStrategy IPromotionStrategy;

    public PromotionActivity(IPromotionStrategy IPromotionStrategy){
        this.IPromotionStrategy = IPromotionStrategy;
    }


    public void run(){
        this.IPromotionStrategy.promote();
    }
}
