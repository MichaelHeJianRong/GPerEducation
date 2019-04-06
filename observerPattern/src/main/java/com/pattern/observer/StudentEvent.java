package com.pattern.observer;

import com.google.common.eventbus.EventBus;

public class StudentEvent {

    public static void main(String[] args) {

        EventBus eventBus = new EventBus();
        TeacherEvent teacherEvent = new TeacherEvent();

        eventBus.register(teacherEvent);
        eventBus.post("我以写好作业");

    }
}
