package com.example.pr7okushko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class profile extends AppCompatActivity implements View.OnClickListener {
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        btn1 = findViewById(R.id.button2);
        btn1.setOnClickListener(profile.this);

    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(profile.this, friends.class);
        startActivity(intent);
    }

}