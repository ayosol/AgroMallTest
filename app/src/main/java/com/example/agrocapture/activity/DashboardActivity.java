package com.example.agrocapture.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.agrocapture.R;
import com.example.agrocapture.adapter.RecyclerViewAdapter;
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
        farmerList.add(new Farmer("Mr. Abayomi", "test@gmail.com", "2000-03-24", address, "Lagos", R.drawable.farmer));
        farmerList.add(new Farmer("Mr. Adeyemi", "test@gmail.com", "2000-03-24", address, "Ogun", R.drawable.farmer_with_tool));
        farmerList.add(new Farmer("Mr. Samson", "test@gmail.com", "2000-03-24", address, "Abuja", R.drawable.farmers));
        farmerList.add(new Farmer("Mrs. Grace", "test@gmail.com", "2000-03-24", address, "Lagos", R.drawable.ic_harvest));
        farmerList.add(new Farmer("Mr. Johnson", "test@gmail.com", "2000-03-24", address, "Lagos", R.drawable.agric_products));
        farmerList.add(new Farmer("Mr. Titus", "test@gmail.com", "2000-03-24", address, "Lagos", R.drawable.ic_person));
        farmerList.add(new Farmer("Mr. Abayomi", "test@gmail.com", "2000-03-24", address, "Lagos", R.drawable.ic_sprout));
        farmerList.add(new Farmer("Mr. Adeyemi", "test@gmail.com", "2000-03-24", address, "Ogun", R.drawable.farm_pic_show));
        farmerList.add(new Farmer("Mr. Abayomi", "test@gmail.com", "2000-03-24", address, "Lagos", R.drawable.farmer));
        farmerList.add(new Farmer("Mr. Adeyemi", "test@gmail.com", "2000-03-24", address, "Ogun", R.drawable.farmer_with_tool));
        farmerList.add(new Farmer("Mr. Samson", "test@gmail.com", "2000-03-24", address, "Abuja", R.drawable.farmers));
        farmerList.add(new Farmer("Mrs. Grace", "test@gmail.com", "2000-03-24", address, "Lagos", R.drawable.ic_harvest));
        farmerList.add(new Farmer("Mr. Johnson", "test@gmail.com", "2000-03-24", address, "Lagos", R.drawable.agric_products));
        farmerList.add(new Farmer("Mr. Titus", "test@gmail.com", "2000-03-24", address, "Lagos", R.drawable.ic_person));
        farmerList.add(new Farmer("Mr. Abayomi", "test@gmail.com", "2000-03-24", address, "Lagos", R.drawable.ic_sprout));
        farmerList.add(new Farmer("Mr. Adeyemi", "test@gmail.com", "2000-03-24", address, "Ogun", R.drawable.farm_pic_show));
        farmerList.add(new Farmer("Mr. Abayomi", "test@gmail.com", "2000-03-24", address, "Lagos", R.drawable.farmer));
        farmerList.add(new Farmer("Mr. Adeyemi", "test@gmail.com", "2000-03-24", address, "Ogun", R.drawable.farmer_with_tool));
        farmerList.add(new Farmer("Mr. Samson", "test@gmail.com", "2000-03-24", address, "Abuja", R.drawable.farmers));
        farmerList.add(new Farmer("Mrs. Grace", "test@gmail.com", "2000-03-24", address, "Lagos", R.drawable.ic_harvest));
        farmerList.add(new Farmer("Mr. Johnson", "test@gmail.com", "2000-03-24", address, "Lagos", R.drawable.agric_products));
        farmerList.add(new Farmer("Mr. Titus", "test@gmail.com", "2000-03-24", address, "Lagos", R.drawable.ic_person));
        farmerList.add(new Farmer("Mr. Abayomi", "test@gmail.com", "2000-03-24", address, "Lagos", R.drawable.ic_sprout));
        farmerList.add(new Farmer("Mr. Adeyemi", "test@gmail.com", "2000-03-24", address, "Ogun", R.drawable.farm_pic_show));


        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, farmerList);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(myAdapter);
    }
}
