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

    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();
        setEvent();
    }

    private void initView(){
        btnLogin = (Button) findViewById(R.id.btnLogin);
    }

    private void setEvent(){
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
