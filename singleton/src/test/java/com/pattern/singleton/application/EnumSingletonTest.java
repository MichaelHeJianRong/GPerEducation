package com.pattern.singleton.application;


import com.pattern.singleton.application.register.EnumSingleton;

import java.lang.reflect.Constructor;

public class EnumSingletonTest {

    public static void main(String[] args) {

        try {
            Class clazz = EnumSingleton.class;
            Constructor constructor = clazz.getDeclaredConstructor(null);

            constructor.setAccessible(true);

//            Object o1 = constructor.newInstance();
            Object o2 = EnumSingleton.getInstance();

//            System.out.println(o1==o2);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
