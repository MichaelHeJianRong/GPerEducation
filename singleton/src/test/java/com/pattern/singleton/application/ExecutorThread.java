package com.pattern.singleton.application;

import com.pattern.singleton.application.laze.LazyDoubleCheckSingleton;
import com.pattern.singleton.application.laze.LazySingleton;

public class ExecutorThread implements Runnable{


    @Override
    public void run() {

        LazyDoubleCheckSingleton singleton = LazyDoubleCheckSingleton.getInstance();

        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }
}
