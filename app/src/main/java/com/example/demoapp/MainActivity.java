package com.example.demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {
EditText email,pass;
TextView num;
String data1,data2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.Email);
        pass = findViewById(R.id.Password);
        Button submit = findViewById(R.id.Login);
//        num = findViewById(R.id.num);

        submit.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View arg0){
                if(!("").equals(email.getText().toString()) || "".equals(pass.getText().toString())){
                    //num.setText(email.getText().toString());
                    data1 = email.getText().toString();
                    data2 = pass.getText().toString();
//                    num.setText("123");
                    Intent intent = new Intent(MainActivity.this,Page2.class);

                    Bundle bundle = new Bundle();
                    bundle.putString("data1",data1);
                    intent.putExtras(bundle);
                    startActivity(intent);

                }
            }
        });

    }


}



