package com.example.carriercafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Pair;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {

                Intent intent=new Intent(getApplicationContext(),HomeActivity.class);
                SystemClock.sleep(1500);
                startActivity(intent);
            }
        });
        thread.start();

    }
}