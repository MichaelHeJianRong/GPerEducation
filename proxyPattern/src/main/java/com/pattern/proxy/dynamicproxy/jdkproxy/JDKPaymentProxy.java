package com.pattern.proxy.dynamicproxy.jdkproxy;

import com.pattern.proxy.dynamicproxy.IPayment;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKPaymentProxy implements InvocationHandler {

    private Object target;

    public Object getInstance(Object obj){
        this.target = obj;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object  obj = method.invoke(this.target,args);
        after();
        return obj;
    }

    private void before(){
        System.out.println("Checking the balance.");
    }

    private void after(){
        System.out.println("Return the message to the frontend.");
    }
}
