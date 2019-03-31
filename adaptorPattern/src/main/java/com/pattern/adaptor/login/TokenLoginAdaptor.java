package com.pattern.adaptor.login;

public class TokenLoginAdaptor  implements LoginAdpator{

    @Override
    public boolean support(Object adapter) {
        return adapter instanceof TokenLoginAdaptor;
    }

    @Override
    public String login(String isd, Object adapter) {
        return "Token Login";
    }
}
