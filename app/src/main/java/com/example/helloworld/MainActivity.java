package com.example.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            Log.e("MainActivity", "savedInstanceState is null");
        } else {
            Log.e("MainActivity", "savedInstanceState is not null");
        }
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "Hello World");
    }
}