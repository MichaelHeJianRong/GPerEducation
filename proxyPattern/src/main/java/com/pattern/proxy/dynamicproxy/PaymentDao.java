package com.pattern.proxy.dynamicproxy;

public class PaymentDao {

    public int pay(Payment payment){

        System.out.println("Payment successfully");
        return 1;

    }
}
