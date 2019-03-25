package com.factory.pattern.method;

import com.factory.pattern.ICourse;

public class Test {


    public static void main(String[] args) {

        ICourseFactory factory = new DoNetFactory();

        ICourse course = factory.create();

        course.record();
    }
}
