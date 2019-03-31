package com.pattern.delegate;

public class Boss {

    public void assign(String job, Manager manager){
        manager.doJob(job);
    }
}
