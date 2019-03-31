package com.pattern.adaptor.login;

public class WechatAdaptor implements LoginAdpator {

    @Override
    public boolean support(Object adapter) {
        return adapter instanceof WechatAdaptor;
    }

    @Override
    public String login(String isd, Object adapter) {
        return "Wechat Login";
    }
}
