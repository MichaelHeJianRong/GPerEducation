package com.pattern.proxy.dynamicproxy.jdkproxy;

import com.pattern.proxy.dynamicproxy.IPayment;

public class AliPay implements IPayment {
    @Override
    public void pay() {
        System.out.println("Ali Payment is Ready.");
    }
}
