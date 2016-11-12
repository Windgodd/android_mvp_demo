package com.demo.android.android_mvp_demo.login.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.demo.android.android_mvp_demo.MainActivity;
import com.demo.android.android_mvp_demo.R;
import com.demo.android.android_mvp_demo.login.presenter.ILoginPresenter;
import com.demo.android.android_mvp_demo.login.presenter.LoginPresenter;

/**
 * Created by apple on 2016/11/12.
 */
public class LoginActivity extends Activity implements ILoginView {

    private Button btnLogin;
    private ILoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_loginview_layout);

        loginPresenter = new LoginPresenter(this);
        initView();

    }

    private void initView(){

        btnLogin = (Button) findViewById(R.id.btn_login_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginPresenter.login();
            }
        });
    }

    @Override
    public String getUserName() {
        return ((EditText)findViewById(R.id.et_login_username)).getText().toString();
    }

    @Override
    public String getPassword() {
        return ((EditText)findViewById(R.id.et_login_password)).getText().toString();
    }

    @Override
    public void toMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}
