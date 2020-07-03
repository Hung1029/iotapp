package com.example.demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Page2 extends AppCompatActivity {
    TextView username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        username = findViewById(R.id.user);

        Bundle bundle = getIntent().getExtras();
        String user = bundle.getString("data1");
        username.setText(user);



    }

}
