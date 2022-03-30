package com.example.sjcet.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.regex.Pattern;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {
 EditText et1,et2,et3,et4,et5,et6,et7;
 Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        et3=findViewById(R.id.et3);
        et4=findViewById(R.id.et4);
        et5=findViewById(R.id.et5);
        et6=findViewById(R.id.et6);
        et7=findViewById(R.id.et7);
        b1=findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences myprep = getSharedPreferences("actvity_main3.xml", 0);
                SharedPreferences.Editor editor = myprep.edit();
                editor.putString("fname", et1.getText().toString());
                editor.putString("lname", et2.getText().toString());
                editor.putString("email", et3.getText().toString());
                editor.putString("mobile", et4.getText().toString());
                editor.putString("username", et5.getText().toString());
                editor.putString("password", et6.getText().toString());
                editor.putString("dob", et7.getText().toString());
                editor.commit();

                Intent intent = new Intent(MainActivity.this, Main3Activity.class);
                intent.putExtra("fname", et1.getText().toString());
                intent.putExtra("lname", et2.getText().toString());
                intent.putExtra("email", et3.getText().toString());
                intent.putExtra("mobile", et4.getText().toString());
                intent.putExtra("username", et5.getText().toString());
                intent.putExtra("password", et6.getText().toString());
                intent.putExtra("dob", et7.getText().toString());
                startActivity(intent);



                    if ((et1.getText().toString().length() == 0)) {
                        et1.setError("Enter the firstname to register");

                    }
                    if ((et2.getText().toString().length() == 0)) {
                        et2.setError("Enter the lastname to register");

                    }
                    if ((et3.getText().toString().length() == 0)) {
                        et3.setError("Enter the email to register");

                    }
                    if ((et4.getText().toString().length() == 0)) {
                        et4.setError("Enter the mobile to register");

                    }
                    if ((et5.getText().toString().length() == 0)) {
                        et5.setError("Enter the username to register");

                    }
                    if ((et6.getText().toString().length() == 0)) {
                        et6.setError("Enter the password to register");

                    }
                    if ((et7.getText().toString().length() == 0)) {
                        et7.setError("Enter the dob to register");


                    }


                }
            });

        }
}




