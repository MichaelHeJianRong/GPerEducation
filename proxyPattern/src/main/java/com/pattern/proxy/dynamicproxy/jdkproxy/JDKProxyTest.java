package com.pattern.proxy.dynamicproxy.jdkproxy;

import com.pattern.proxy.dynamicproxy.IPayment;

public class JDKProxyTest {

    public static void main(String[] args) {

        try{
            IPayment payment = (IPayment) new JDKPaymentProxy().getInstance(new AliPay());

            payment.pay();
        }catch (Exception ex){

            ex.printStackTrace();
        }


    }
}
