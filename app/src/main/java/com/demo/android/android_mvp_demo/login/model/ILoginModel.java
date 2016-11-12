package com.demo.android.android_mvp_demo.login.model;

/**
 * Created by wind on 2016/11/12.
 *
 */
public interface ILoginModel {
    void login(String username, String password, OnLoginListener loginListener);

    public interface OnLoginListener{
        void loginSuccessed();
        void loginFailded();
    }

}
