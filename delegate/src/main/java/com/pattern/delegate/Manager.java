package com.pattern.delegate;

import java.util.HashMap;
import java.util.Map;

public class Manager implements  IEmplyee{

    Map<String,IEmplyee> target = new HashMap<>();

    public Manager(){

        target.put("Wash" , new EmployeeA());
        target.put("Cook" , new EmployeeB());
    }

    @Override
    public void doJob(String job) {
        if(target.get(job) != null ) {
            target.get(job).doJob(job);
        }
    }
}
