package com.example.baltazarmockupapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class baltazarwelcome extends AppCompatActivity {
    Button b1;
    EditText ed1, ed2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baltazarwelcome);
        b1 = (Button) findViewById(R.id.button1);
        ed1 = (EditText) findViewById(R.id.user);
        ed2 = (EditText) findViewById(R.id.pass);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1.getText().toString().equals("george") && ed2.getText().toString().equals("baltazar")) {
                    Toast.makeText(getApplicationContext(), "Access Granted", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), baltazarnext.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Invalid Username and Password", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}