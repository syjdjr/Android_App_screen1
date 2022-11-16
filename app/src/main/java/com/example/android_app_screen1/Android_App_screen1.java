package com.example.android_app_screen1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class Android_App_screen1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_app_screen1);


        LinearLayout linear = new LinearLayout(this);

        Button signup_bt = new Button(this);
        signup_bt.setText("회원가입");
        linear.addView(signup_bt);


        EditText username = (EditText) findViewById(R.id.username);
        String strText = username.getText().toString();
        linear.addView(username);

        EditText password = (EditText) findViewById(R.id.password);
        strText = username.getText().toString();
        linear.addView(password);


        setContentView(linear);

    }


}