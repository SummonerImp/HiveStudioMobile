package com.example.projetotcc.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.projetotcc.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }
}