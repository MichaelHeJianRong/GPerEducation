package com.pattern.observer;

import com.google.common.eventbus.Subscribe;

public class TeacherEvent {

    @Subscribe
    public void subscribe(String str){
        System.out.println("收到");


    }
}
