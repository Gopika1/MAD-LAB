package com.example.sjcet.loginreg;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        final EditText editfirstName, editlastName, editEmail, editMobile;
        final Button buttonSubmit;

        editfirstName = (EditText) findViewById(R.id.editText3);
        editlastName = (EditText) findViewById(R.id.editText5);
        editEmail = (EditText) findViewById(R.id.editText7);
        editMobile = (EditText) findViewById(R.id.editText9);
        buttonSubmit = (Button) findViewById(R.id.button4);
        buttonSubmit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                if (editfirstName.getText().toString().length() == 0) {
                    editfirstName.setError("First name not entered");
                    editfirstName.requestFocus();
                }
                if (editlastName.getText().toString().length() == 0) {
                    editlastName.setError("Last name not entered");
                    editlastName.requestFocus();
                }

                if (editEmail.getText().toString().length() == 0) {
                    editEmail.setError("email not entered");
                    editEmail.requestFocus();
                }
                if (editMobile.getText().toString().length() == 0) {
                    editMobile.setError("phone not entered");
                    editMobile.requestFocus();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Success", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}