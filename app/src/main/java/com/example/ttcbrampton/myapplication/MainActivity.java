package com.example.ttcbrampton.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    static String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button encryptButton = (Button) (findViewById(R.id.encryptButton));
        encryptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, encryptNow.class));
            }
        });

        Button decryptButton = (Button)(findViewById(R.id.decryptButton));
        decryptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, decryptNow.class));
            }
        });

        Log.i(TAG, "App started successfully.");
    }

    }




