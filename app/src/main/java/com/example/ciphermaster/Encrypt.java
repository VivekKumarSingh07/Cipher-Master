package com.example.ciphermaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.TimerTask;

public class Encrypt extends AppCompatActivity {

    String title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.encrypt);

        Intent intent = getIntent();
        title = intent.getStringExtra("Title");
        setTitle(title);

    }
}
