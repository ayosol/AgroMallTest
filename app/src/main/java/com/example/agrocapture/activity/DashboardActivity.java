package com.example.agrocapture.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.agrocapture.R;
import com.example.agrocapture.model.Farmer;

import java.util.ArrayList;
import java.util.List;

public class DashboardActivity extends AppCompatActivity {

    List<Farmer> farmerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        farmerList = new ArrayList<>();

        //Populate the List here
        farmerList.add(new Farmer("Mr. Abayomi", "test@gmail.com", "2000-03-24", "Lagos", R.drawable.farmer));
        farmerList.add(new Farmer("Mr. Adeyemi", "test@gmail.com", "2000-03-24", "Ogun", R.drawable.farmer));
        farmerList.add(new Farmer("Mr. Samson", "test@gmail.com", "2000-03-24", "Abuja", R.drawable.farmer));
        farmerList.add(new Farmer("Mrs. Grace", "test@gmail.com", "2000-03-24", "Lagos", R.drawable.farmer));
        farmerList.add(new Farmer("Mr. Johnson", "test@gmail.com", "2000-03-24", "Lagos", R.drawable.farmer));
        farmerList.add(new Farmer("Mr. Titus", "test@gmail.com", "2000-03-24", "Lagos", R.drawable.farmer));
        farmerList.add(new Farmer("Mr. Abayomi", "test@gmail.com", "2000-03-24", "Lagos", R.drawable.farmer));
        farmerList.add(new Farmer("Mr. Adeyemi", "test@gmail.com", "2000-03-24", "Ogun", R.drawable.farmer));
        farmerList.add(new Farmer("Mr. Samson", "test@gmail.com", "2000-03-24", "Abuja", R.drawable.farmer));
        farmerList.add(new Farmer("Mrs. Grace", "test@gmail.com", "2000-03-24", "Lagos", R.drawable.farmer));
        farmerList.add(new Farmer("Mr. Johnson", "test@gmail.com", "2000-03-24", "Lagos", R.drawable.farmer));
        farmerList.add(new Farmer("Mr. Titus", "test@gmail.com", "2000-03-24", "Lagos", R.drawable.farmer));
        farmerList.add(new Farmer("Mr. Abayomi", "test@gmail.com", "2000-03-24", "Lagos", R.drawable.farmer));
        farmerList.add(new Farmer("Mr. Adeyemi", "test@gmail.com", "2000-03-24", "Ogun", R.drawable.farmer));
        farmerList.add(new Farmer("Mr. Samson", "test@gmail.com", "2000-03-24", "Abuja", R.drawable.farmer));
        farmerList.add(new Farmer("Mrs. Grace", "test@gmail.com", "2000-03-24", "Lagos", R.drawable.farmer));
        farmerList.add(new Farmer("Mr. Johnson", "test@gmail.com", "2000-03-24", "Lagos", R.drawable.farmer));
        farmerList.add(new Farmer("Mr. Titus", "test@gmail.com", "2000-03-24", "Lagos", R.drawable.farmer));
        farmerList.add(new Farmer("Mr. Abayomi", "test@gmail.com", "2000-03-24", "Lagos", R.drawable.farmer));
        farmerList.add(new Farmer("Mr. Adeyemi", "test@gmail.com", "2000-03-24", "Ogun", R.drawable.farmer));
        farmerList.add(new Farmer("Mr. Samson", "test@gmail.com", "2000-03-24", "Abuja", R.drawable.farmer));
        farmerList.add(new Farmer("Mrs. Grace", "test@gmail.com", "2000-03-24", "Lagos", R.drawable.farmer));
        farmerList.add(new Farmer("Mr. Johnson", "test@gmail.com", "2000-03-24", "Lagos", R.drawable.farmer));
        farmerList.add(new Farmer("Mr. Titus", "test@gmail.com", "2000-03-24", "Lagos", R.drawable.farmer));


        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, farmerList);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(myAdapter);
    }
}
