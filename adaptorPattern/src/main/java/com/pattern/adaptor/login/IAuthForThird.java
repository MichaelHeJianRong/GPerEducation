package com.pattern.adaptor.login;

public interface IAuthForThird {

    String loginForQQ(String id);

    String loginForWechat(String id);


    String loginForToken(String token);

    String loginForEmail(String telphone, String code);

}
