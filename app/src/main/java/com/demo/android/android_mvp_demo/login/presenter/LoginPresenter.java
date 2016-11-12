package com.demo.android.android_mvp_demo.login.presenter;

import com.demo.android.android_mvp_demo.login.model.ILoginModel;
import com.demo.android.android_mvp_demo.login.model.LoginModelImpl;
import com.demo.android.android_mvp_demo.login.view.ILoginView;

/**
 * Created by apple on 2016/11/12.
 */
public class LoginPresenter implements ILoginPresenter,ILoginModel.OnLoginListener{
    private ILoginModel loginModel;
    private ILoginView loginView;

    public LoginPresenter(ILoginView loginView){
        this.loginModel = new LoginModelImpl();
        this.loginView = loginView;
    }

    @Override
    public void login() {
        loginModel.login(loginView.getUserName(),loginView.getPassword(),this);

    }

    @Override
    public void loginSuccessed() {
        loginView.toMainActivity();
    }

    @Override
    public void loginFailded() {

    }
}
