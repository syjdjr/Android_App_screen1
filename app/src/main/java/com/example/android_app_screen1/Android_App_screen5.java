package com.example.android_app_screen1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.SearchView;


public class Android_App_screen5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_app_screen5);

        LinearLayout linear = new LinearLayout(this);

        SearchView insta_bt = new SearchView(this);
        linear.addView(insta_bt);

        SearchView google_bt = new SearchView(this);
        linear.addView(google_bt);

        // google mapview는 기능 구현 하면서 넣어야 할듯


    }
}