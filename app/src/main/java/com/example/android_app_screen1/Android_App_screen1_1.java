package com.example.android_app_screen1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;

public class Android_App_screen1_1 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_app_screen11);

        LinearLayout linear = new LinearLayout(this);


        Button cancel_bt = new Button(this);
        cancel_bt.setText ("Cancel");
        linear.addView(cancel_bt);

        Button submit_bt = new Button(this);
        submit_bt.setText ("Submit");
        linear.addView(submit_bt);

        EditText put_name = (EditText) findViewById(R.id.put_username);
        String strText = put_name.getText().toString();

        EditText put_phone = (EditText) findViewById(R.id.put_phone);
        strText = put_phone.getText().toString();

        EditText put_id = (EditText) findViewById(R.id.put_id);
        strText = put_id.getText().toString();

        EditText put_password = (EditText) findViewById(R.id.put_password);
        strText = put_password.getText().toString();


        CheckBox checkbox1 = findViewById(R.id.checkbox1);
        checkbox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) buttonView.setText("개인정보 수집에 동의합니다.");
                else buttonView.setText("개인정보 수집에 동의하지 않습니다");

            }
        });

        CheckBox checkbox2 = findViewById(R.id.checkbox2);
        checkbox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) buttonView.setText("GPS 위치정보 수집에 동의합니다.");
                else buttonView.setText("GPS 위치정보 수집에 동의하지 않습니다.");

            }
        });

        CheckBox checkbox3 = findViewById(R.id.checkbox3);
        checkbox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) buttonView.setText("푸쉬 알림 수신에 동의합니다.");
                else buttonView.setText("푸쉬 알림 수신에 동의하지 않습니다.");

            }
        });


        setContentView(linear);



    }
}