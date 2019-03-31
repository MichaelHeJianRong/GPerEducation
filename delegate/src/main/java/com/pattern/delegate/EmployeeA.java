package com.pattern.delegate;

public class EmployeeA implements IEmplyee {
    @Override
    public void doJob(String job) {
        System.out.println("A is doing the job : " + job);
    }
}
