package com.pattern.adaptor.login;

public class EmailLoginAdaptor implements LoginAdpator {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof EmailLoginAdaptor;
    }

    @Override
    public String login(String isd, Object adapter) {
        return "Email Login";
    }
}
