package com.demo.android.android_mvp_demo.login.model;

/**
 * Created by wind on 2016/11/12.
 */
public class LoginModelImpl implements ILoginModel{


    @Override
    public void login(String username, String password, OnLoginListener loginListener) {
        //登录处理

        if("mvp".equals(username) && "hello".equals(password)){
            loginListener.loginSuccessed();
        }else{
            loginListener.loginFailded();
        }

    }
}
