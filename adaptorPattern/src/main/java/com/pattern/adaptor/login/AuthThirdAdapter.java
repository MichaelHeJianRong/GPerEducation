package com.pattern.adaptor.login;

public class AuthThirdAdapter implements IAuthForThird{


    @Override
    public String loginForQQ(String id) {
        return processLogin(id , QQLoginAdaptor.class);
    }

    @Override
    public String loginForWechat(String id) {
        return processLogin(id, WechatAdaptor.class);
    }

    @Override
    public String loginForToken(String token) {
        return processLogin(token, TokenLoginAdaptor.class);
    }

    @Override
    public String loginForEmail(String email, String code) {
        return processLogin(email, EmailLoginAdaptor.class);
    }

    private String processLogin(String key,Class<? extends LoginAdpator> clazz){
        try{
            LoginAdpator adapter = clazz.newInstance();

            if(adapter.support(adapter)){
                return adapter.login(key,adapter);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
