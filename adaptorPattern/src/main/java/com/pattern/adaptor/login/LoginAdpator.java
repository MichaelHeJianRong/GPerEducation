package com.pattern.adaptor.login;

public interface LoginAdpator {

    boolean support(Object adapter);

    String login(String isd,Object adapter);

}
