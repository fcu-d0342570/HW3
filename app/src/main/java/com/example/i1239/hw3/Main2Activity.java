package com.example.i1239.hw3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    EditText etName;
    public  static  final  String KEY_NAME = "KEY_NAME";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button backbtn = (Button)findViewById(R.id.button2);
        backbtn.setOnClickListener(back);
        etName = (EditText)findViewById(R.id.editText2);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    private View.OnClickListener back = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String name = etName.getText().toString();
            Intent intent = new Intent();
            intent.setClass(Main2Activity.this, MainActivity.class);
            intent.putExtra(KEY_NAME, name);
            startActivity(intent);
        }
    };

}
