package com.example.sjcet.loginreg;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Main2Activity extends AppCompatActivity {

    EditText userNameEdt, passwordEdt;
    Button loginBtn;
    String username="admin";
    String password ="admin";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        userNameEdt = findViewById(R.id.username);
        passwordEdt = findViewById(R.id.password);
        loginBtn = findViewById(R.id.log);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String userName = userNameEdt.getText().toString();
                String password = passwordEdt.getText().toString();


                if (userName.equals(username) && password.equals(password)) {
                    Intent intent = new Intent(Main2Activity.this,
                            Main4Activity.class);
                    startActivity(intent);
                }
                else {
                   Toast.makeText(Main2Activity.this, "Invalid username or password", Toast.LENGTH_SHORT).show();
               }


            }
        });
    }

}
