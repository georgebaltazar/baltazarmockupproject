package com.example.baltazarmockupapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
public class baltazarnext extends AppCompatActivity {
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baltazarnext);
        b1=(Button)findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),baltazarnext2.class);
                startActivity(intent);
            }
        });
    }
}
