package com.pattern.proxy.staticproxy;

public class Father {

    private Person person;

    public Father(Person person){
        this.person = person;
    }

    public void findLove(){
        System.out.println("Father prepare");

        person.findLove();

        System.out.println("find a love");
    }

}
