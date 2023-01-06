package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView Fname, Lname, viewFname, viewLname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Fname = findViewById(R.id.Fname);
        Lname = findViewById(R.id.Lname);
        viewFname = findViewById(R.id.viewFname);
        viewLname = findViewById(R.id.viewLname);
        Intent objIntent = getIntent();
        String fname = objIntent.getStringExtra("first");
        String lname = objIntent.getStringExtra("last");
        viewFname.setText(fname);
        viewLname.setText(lname);
    }
}