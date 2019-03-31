package com.pattern.proxy.dynamicproxy.cglibproxy;

public class CglibTest {


    public static void main(String[] args) {

        Customer customer = (Customer) new CglibAgent().getInstance(Customer.class);

        customer.buy();

    }
}
