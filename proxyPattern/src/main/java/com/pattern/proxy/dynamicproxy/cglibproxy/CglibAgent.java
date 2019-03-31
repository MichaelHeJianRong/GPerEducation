package com.pattern.proxy.dynamicproxy.cglibproxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibAgent implements MethodInterceptor {

    public Object getInstance(Class<?> clazz){

        Enhancer enhancer  = new Enhancer();
        enhancer.setCallback(this);
        enhancer.setSuperclass(clazz);
        return enhancer.create();

    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        before();
        Object obj = methodProxy.invokeSuper(o,objects);
        after();

        return obj;
    }

    private void before(){
        System.out.println("Ask for the price of this property.");
    }

    private void after(){
        System.out.println("");
    }
}
