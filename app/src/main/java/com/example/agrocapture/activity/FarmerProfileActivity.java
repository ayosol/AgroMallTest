package com.example.agrocapture.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.agrocapture.R;

import java.util.Objects;

public class FarmerProfileActivity extends AppCompatActivity {

    TextView txt_farmers_name;
    TextView txt_farmers_email;
    TextView txt_farmers_address;
    ImageView farmers_thumbnail;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmer_profile);

        //Set back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Setup UI
        txt_farmers_name = findViewById(R.id.txt_farmers_name);
        txt_farmers_email = findViewById(R.id.txt_farmers_email);
        txt_farmers_address = findViewById(R.id.txt_farmers_address);
        farmers_thumbnail = findViewById(R.id.farmers_img);


        //Receive data from intent
        Intent intent = getIntent();
        String farmers_name = Objects.requireNonNull(intent.getExtras()).getString("Name");
        String farmers_email = intent.getExtras().getString("Email");
        String farmers_address = intent.getExtras().getString("Address");
        int farmers_img = intent.getExtras().getInt("Thumbnail");

        //Set the values on the view
        txt_farmers_name.setText(farmers_name);
        txt_farmers_email.setText(farmers_email);
        txt_farmers_address.setText(farmers_address);
        farmers_thumbnail.setImageResource(farmers_img);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
