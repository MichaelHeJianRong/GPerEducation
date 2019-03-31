package com.pattern.delegate;

public class EmployeeB implements IEmplyee {
    @Override
    public void doJob(String jobName) {

        System.out.println("B is doing the job: " + jobName);

    }
}
