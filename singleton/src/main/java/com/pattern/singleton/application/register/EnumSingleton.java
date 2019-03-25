package com.pattern.singleton.application.register;

public enum  EnumSingleton {

    INSTANCE;

    private String data;


    public static EnumSingleton getInstance(){
        return  INSTANCE;
    }

}
