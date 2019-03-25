package com.factory.pattern.method;

import com.factory.pattern.ICourse;
import com.factory.pattern.JavaCourse;

public class JavaCourseFactory implements ICourseFactory{

    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
