package com.pattern.adaptor.login;

public class PhoneLoginAdaptor implements LoginAdpator{

    @Override
    public boolean support(Object adapter) {
        return adapter instanceof PhoneLoginAdaptor;
    }

    @Override
    public String login(String isd, Object adapter) {
        return "Phone Login";
    }
}
