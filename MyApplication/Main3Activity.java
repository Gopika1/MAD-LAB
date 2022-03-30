package com.example.sjcet.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        tv3=findViewById(R.id.tv3);
        tv4=findViewById(R.id.tv4);
        tv5=findViewById(R.id.tv5);
        tv6=findViewById(R.id.tv6);
        tv7=findViewById(R.id.tv7);
       // tv8=findViewById(R.id.tv8);
        Intent intent=getIntent();

        SharedPreferences mypref=getSharedPreferences("activity_main3.xml",0);
        String str1=intent.getStringExtra("fname");
        String str2=intent.getStringExtra("lname");
        String str3=intent.getStringExtra("email");
        String str4=intent.getStringExtra("mobile");
        String str5=intent.getStringExtra("username");
        String str6=intent.getStringExtra("password");
        String str7=intent.getStringExtra("dob");
        //String str8=intent.getStringExtra("age");
        tv1.setText(str1);
        tv2.setText(str2);
        tv3.setText(str3);
        tv4.setText(str4);
        tv5.setText(str5);
        tv6.setText(str6);
        tv7.setText(str7);
        //tv8.setText(str8);

    }
}
