package com.example.agrocapture.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.agrocapture.R;

public class AddFarmerActivity extends AppCompatActivity {

    private static final int CAMERA_REQUEST_CODE = 1001;
    ImageView btn_image;
    Button btn_add_farmer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_farmer);

        //Set back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_add_farmer = findViewById(R.id.btn_add_farmer);
        btn_image = findViewById(R.id.btn_take_photo);

        /*Choose or Snap Picture code starts here*/
        btn_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, CAMERA_REQUEST_CODE);
            }
        });


        //Click Listener for REgister Button to go to AddFarmActivity
        btn_add_farmer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AddFarmerActivity.this, AddFarmActivity.class));
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == CAMERA_REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                Bitmap bitmap = (Bitmap) data.getExtras().get("data");
                btn_image.setImageBitmap(bitmap);
            }
        }
    }
}
