package com.factory.pattern.simple;

import com.factory.pattern.ICourse;
import com.factory.pattern.JavaCourse;

public class Test {

    public static void main(String[] args) {

        CourseFactory courseFactory = new CourseFactory();

        ICourse course = courseFactory.create(JavaCourse.class);

        course.record();


    }
}
