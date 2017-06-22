package com.androidmanifester.mitsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    String s;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv= (TextView)findViewById(R.id.textView);
        s=getIntent().getStringExtra("ramesh");
        tv.setText(s);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.ramesh,menu);
        return super.onCreateOptionsMenu(menu);
    }
}
