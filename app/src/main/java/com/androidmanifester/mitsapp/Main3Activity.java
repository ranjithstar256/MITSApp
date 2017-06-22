package com.androidmanifester.mitsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {
    ListView  listView;
    ArrayList<String>  arrayList;
    ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        listView= (ListView) findViewById(R.id.listvw);
        arrayList=new ArrayList<String>();

        arrayList.add("ganesh");
        arrayList.add("vinay");
        arrayList.add("madhuri");
        arrayList.add("hemanth");
        arrayList.add("ambuja");
        arrayList.add("kasjfj");
        arrayList.add("ganesh");
        arrayList.add("vinay");
        arrayList.add("madhuri");
        arrayList.add("hemanth");
        arrayList.add("ambuja");
        arrayList.add("kasjfj");
        arrayList.add("ganesh");
        arrayList.add("vinay");
        arrayList.add("madhuri");
        arrayList.add("hemanth");
        arrayList.add("ambuja");
        arrayList.add("kasjfj");
        arrayList.add("ganesh");
        arrayList.add("vinay");
        arrayList.add("madhuri");
        arrayList.add("hemanth");
        arrayList.add("ambuja");
        arrayList.add("kasjfj");
        arrayList.add("ganesh");
        arrayList.add("vinay");
        arrayList.add("madhuri");
        arrayList.add("hemanth");
        arrayList.add("ambuja");
        arrayList.add("kasjfj");
        arrayList.add("ganesh");
        arrayList.add("vinay");
        arrayList.add("madhuri");
        arrayList.add("hemanth");
        arrayList.add("ambuja");
        arrayList.add("kasjfj");
        arrayList.add("ganesh");
        arrayList.add("vinay");
        arrayList.add("madhuri");
        arrayList.add("hemanth");
        arrayList.add("ambuja");
        arrayList.add("kasjfj");
        arrayList.add("ganesh");
        arrayList.add("vinay");
        arrayList.add("madhuri");
        arrayList.add("hemanth");
        arrayList.add("ambuja");
        arrayList.add("kasjfj");
        arrayList.add("ganesh");
        arrayList.add("vinay");
        arrayList.add("madhuri");
        arrayList.add("hemanth");
        arrayList.add("ambuja");
        arrayList.add("kasjfj");
        arrayList.add("ganesh");
        arrayList.add("vinay");
        arrayList.add("madhuri");
        arrayList.add("hemanth");
        arrayList.add("ambuja");
        arrayList.add("kasjfj");
        arrayList.add("ganesh");
        arrayList.add("vinay");
        arrayList.add("madhuri");
        arrayList.add("hemanth");
        arrayList.add("ambuja");
        arrayList.add("kasjfj");


        arrayAdapter=new ArrayAdapter<String>(Main3Activity.this,android.R.layout.simple_list_item_1,arrayList);

        listView.setAdapter(arrayAdapter);


    }
}
