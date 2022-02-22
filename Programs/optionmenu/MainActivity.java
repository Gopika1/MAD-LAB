package com.example.sjcet.optionmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.tv);
        String msg=getIntent().getStringExtra("mykey");// receiving the data
        tv.setText(msg);                                   // display(welcom changing to admin)
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.optionmenu,menu);    //connecting menu



        return true;                    // changing to true
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Refresh:   // full colon
                Toast.makeText(this," Emergency clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.Settings:
                Toast.makeText(this," Profile clicked",Toast.LENGTH_SHORT).show();
                break;


        }
        return true;// changing to true
    }
}
