package com.pattern.adaptor.login;

public class QQLoginAdaptor implements LoginAdpator {

    @Override
    public boolean support(Object adapter) {
        return adapter instanceof QQLoginAdaptor;
    }

    @Override
    public String login(String isd, Object adapter) {
        return "QQ Login";
    }
}
