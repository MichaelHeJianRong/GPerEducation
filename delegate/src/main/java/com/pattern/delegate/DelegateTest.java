package com.pattern.delegate;

public class DelegateTest {

    public static void main(String[] args) {

        new Boss().assign("Wash", new Manager());
    }
}
