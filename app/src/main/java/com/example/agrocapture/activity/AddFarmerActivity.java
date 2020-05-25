package com.example.agrocapture.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.agrocapture.R;

public class AddFarmerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_farmer);

        //Set back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
