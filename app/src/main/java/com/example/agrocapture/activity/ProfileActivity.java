package com.example.agrocapture.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.agrocapture.R;

public class ProfileActivity extends AppCompatActivity {

    private TextView txt_farmers_name, txt_farmers_email;
    private ImageView farmers_thumbnail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        txt_farmers_name = findViewById(R.id.txt_farmers_name);
        txt_farmers_email = findViewById(R.id.txt_farmers_email);
        farmers_thumbnail = findViewById(R.id.farmers_img);


        //Receive data from intent
        Intent intent = getIntent();
        String farmers_name = intent.getExtras().getString("Name");
        String farmers_email = intent.getExtras().getString("Email");
        int farmers_img = intent.getExtras().getInt("Thumbnail");

        //Set the values on the view
        txt_farmers_name.setText(farmers_name);
        txt_farmers_email.setText(farmers_email);
        farmers_thumbnail.setImageResource(farmers_img);

    }
}
