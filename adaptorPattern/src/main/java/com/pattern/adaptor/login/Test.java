package com.pattern.adaptor.login;

public class Test {
    public static void main(String[] args) {

        IAuthForThird authThirdAdapter = new AuthThirdAdapter();

        System.out.println(authThirdAdapter.loginForQQ("1111"));
    }
}
