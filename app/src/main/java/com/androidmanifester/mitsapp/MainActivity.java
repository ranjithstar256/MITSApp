package com.androidmanifester.mitsapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   Button v;
    EditText ed,ed2;
    TextView tv;
    String s,s2;
    /// declaration above oncreate

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        v=(Button)findViewById(R.id.button);
        ed= (EditText) findViewById(R.id.editText);
        ed2= (EditText) findViewById(R.id.editText2);
        tv= (TextView) findViewById(R.id.textView2);
        /// initi.. inside oncreate nmn 
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s= ed.getText().toString();
                s2= ed2.getText().toString();
                tv.setText(s+"\n"+s2);

                // Toast.makeText(MainActivity.this, s+"\n"+s2,Toast.LENGTH_LONG).show();
                Intent mits = new Intent(MainActivity.this,Main2Activity.class);
                mits.putExtra("ramesh",s2);
                startActivity(mits);
            }
        });
        //usage inside or
    }

    public void kondamma(View view) {
        AlertDialog.Builder alrt = new AlertDialog.Builder(MainActivity.this);

        alrt.setTitle("Caution!");
        alrt.setMessage("confim delete?");
        alrt.setIcon(android.R.drawable.stat_sys_warning);

        alrt.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
               Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });

        alrt.setNegativeButton("No",null);
        alrt.setNeutralButton("Cancel",null);

        alrt.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.renuka,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        switch (id){
            case R.id.idhelp:
                Toast.makeText(this, "help selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.idla:
                Intent intent = new Intent(MainActivity.this,Main3Activity.class);
                startActivity(intent);
                break;
        }
        //Toast.makeText(this, "menu item got clicked", Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }

    //usage outside
}