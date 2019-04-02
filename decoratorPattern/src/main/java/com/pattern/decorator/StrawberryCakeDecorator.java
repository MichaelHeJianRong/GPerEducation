package com.pattern.decorator;

public class StrawberryCakeDecorator extends BaseCakeDecorator{


    public StrawberryCakeDecorator(Cake cake) {
        super(cake);
    }

    @Override
    protected String message() {
        return super.message() + " add Strawberry";
    }

    @Override
    protected int getPrice() {
        return 20;
    }
}
