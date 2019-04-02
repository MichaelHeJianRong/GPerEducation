package com.pattern.decorator;

public class BaseCake extends Cake {

    @Override
    protected String message() {
        return "cake";
    }

    @Override
    protected int getPrice() {
        return 15;
    }
}
