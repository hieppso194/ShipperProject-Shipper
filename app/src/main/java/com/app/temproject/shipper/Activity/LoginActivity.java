package com.app.temproject.shipper.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.app.temproject.shipper.R;

/**
 * Created by huyhoang on 12/08/2016.
 */
public class LoginActivity extends Activity {

    Button btnLogin,btnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();
        setEvent();
    }

    private void initView(){
        btnLogin = (Button) findViewById(R.id.buttondangkytaikhoan);
        btnRegister = (Button) findViewById(R.id.buttondangky);
    }

    private void setEvent(){
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}
