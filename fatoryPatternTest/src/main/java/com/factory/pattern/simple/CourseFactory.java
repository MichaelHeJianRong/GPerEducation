package com.factory.pattern.simple;

import com.factory.pattern.ICourse;

public class CourseFactory {

    public ICourse create(Class clazz){

        try{
            if(null != clazz){
                return (ICourse)clazz.newInstance();
            }

        }catch (Exception ex){

        }
        return null;
    }
}
