package com.pattern.singleton.application;

import com.pattern.singleton.application.laze.LazyInnerClassSingleton;

import java.lang.reflect.Constructor;

public class LazyInnerSingletonTest {


    public static void main(String[] args) {

        try{

            Class clazz = LazyInnerClassSingleton.class;
            Constructor constructor = clazz.getDeclaredConstructor(null);

            constructor.setAccessible(true);

            Object o1 = constructor.newInstance();
            Object o2 = LazyInnerClassSingleton.getInstance();

            System.out.println(o1==o2);

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
