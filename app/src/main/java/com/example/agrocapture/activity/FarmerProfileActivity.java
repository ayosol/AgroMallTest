package com.example.agrocapture.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.agrocapture.R;

public class FarmerProfileActivity extends AppCompatActivity {

    private TextView txt_farmers_name;
    private TextView txt_farmers_email;
    private TextView txt_farmers_address;
    private ImageView farmers_thumbnail;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        //Set back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Receive data from intent
        Intent intent = getIntent();
        String farmers_name = intent.getExtras().getString("Name");
        String farmers_email = intent.getExtras().getString("Email");
        String farmers_address = intent.getExtras().getString("Address");
        int farmers_img = intent.getExtras().getInt("Thumbnail");

        //Set the values on the view
        txt_farmers_name.setText(farmers_name);
        txt_farmers_email.setText(farmers_email);
        txt_farmers_address.setText(farmers_address);
        farmers_thumbnail.setImageResource(farmers_img);
    }

}
