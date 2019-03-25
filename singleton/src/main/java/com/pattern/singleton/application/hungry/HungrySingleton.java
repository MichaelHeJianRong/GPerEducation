package com.pattern.singleton.application.hungry;

public class HungrySingleton {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){}


    public static HungrySingleton getInstance(){

        return hungrySingleton;
    }
}
