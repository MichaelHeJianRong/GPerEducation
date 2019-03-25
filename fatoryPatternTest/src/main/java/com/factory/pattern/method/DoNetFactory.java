package com.factory.pattern.method;

import com.factory.pattern.DoNetCourse;
import com.factory.pattern.ICourse;

public class DoNetFactory implements ICourseFactory {

    @Override
    public ICourse create() {
        return new DoNetCourse();
    }
}
