package com.pattern.decorator;

public class TestDecorator {

    public static void main(String[] args) {

        Cake cake;

        cake = new BaseCake();

        cake = new StrawberryCakeDecorator(cake);

        System.out.println( cake.getPrice() + ";" + cake.message());

    }
}
