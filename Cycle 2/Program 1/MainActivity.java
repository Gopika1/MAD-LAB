package com.example.sjcet.cycle2program1;
import android.content.Intent;
import android.widget.Button;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sjcet.cycle2program1.R;

public class MainActivity extends AppCompatActivity {
    Button bt;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt =findViewById(R.id.bt);
    }
    public void click(View view) {
        OpenNewActivity();
    }
    public void OpenNewActivity()
    {
        Intent intent=new Intent(this, com.example.sjcet.cycle2program1.activity_main2.class);
        startActivity(intent);
    }
}