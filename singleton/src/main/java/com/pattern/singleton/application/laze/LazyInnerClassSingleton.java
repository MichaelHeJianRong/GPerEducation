package com.pattern.singleton.application.laze;

public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton(){

        if(LazyInner.LAZY_INNER_CLASS_SINGLETON != null){
            throw new RuntimeException("Can not create Singleton object!");
        }

    }

    public static LazyInnerClassSingleton getInstance(){

        return LazyInner.LAZY_INNER_CLASS_SINGLETON;

    }

    private static class LazyInner{

        private static final LazyInnerClassSingleton LAZY_INNER_CLASS_SINGLETON = new LazyInnerClassSingleton();
    }
}
