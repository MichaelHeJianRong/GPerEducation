package com.factory.pattern.abstractfactory;

import com.factory.pattern.ICourse;

public abstract interface ICourseFactory {

    ICourse createCourse();

    IDocument createDocument();

    IVideo createVideo();
}
