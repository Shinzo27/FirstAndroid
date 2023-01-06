package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView lblFname, lblLname;
    Button btnSubmit;
    TextView txtFname, txtLname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        controlinitialization();
        buttonClicks();
    }

    private void controlinitialization(){
        lblFname = findViewById(R.id.lblFname);
        lblLname = findViewById(R.id.lblLname);
        btnSubmit = findViewById(R.id.btnSubmit);
        txtLname = findViewById(R.id.txtLname);
        txtFname = findViewById(R.id.txtFname);
    }

    private void buttonClicks(){
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Button Clicked!",Toast.LENGTH_SHORT).show();
                Intent objIntent = new Intent(getApplicationContext(),SecondActivity.class);
                String fname = txtFname.getText().toString();
                String lname = txtLname.getText().toString();
                objIntent.putExtra("first",fname);
                objIntent.putExtra("last",lname);
                startActivity(objIntent);
            }
        });
    }
}