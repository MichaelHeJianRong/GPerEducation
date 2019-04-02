package com.pattern.decorator;

public abstract class BaseCakeDecorator extends Cake {

    private Cake cake;

    public BaseCakeDecorator(Cake cake) {
        this.cake = cake;
    }


    @Override
    protected String message() {
        return this.cake.message();
    }

    @Override
    protected int getPrice() {
        return this.cake.getPrice();
    }
}
