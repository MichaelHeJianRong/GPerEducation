package com.pattern.singleton.application.hungry;

public class HungrySingletonStatic {

    private static final HungrySingletonStatic hungrySingleton;

    static{

        hungrySingleton = new HungrySingletonStatic();
    }

    private HungrySingletonStatic(){}


    public static HungrySingletonStatic getInstance(){

        return hungrySingleton;
    }
}
