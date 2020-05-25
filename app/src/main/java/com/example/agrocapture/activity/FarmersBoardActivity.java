package com.example.agrocapture.activity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.agrocapture.R;
import com.example.agrocapture.adapter.RecyclerViewAdapter;
import com.example.agrocapture.model.Farmer;

import java.util.ArrayList;
import java.util.List;

public class FarmersBoardActivity extends AppCompatActivity {

    private List<Farmer> farmerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmers_board);

        //Set back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        farmerList = new ArrayList<>();

        //Populate the List here
        farmerList.add(new Farmer("Mr. Abayomi", "test@gmail.com", "2000-03-24", "Akoka street, Lagos, Nigeria", "Lagos", R.drawable.farmer));
        farmerList.add(new Farmer("Mr. Adeyemi", "test@gmail.com", "2000-03-24", "Akoka street, Lagos, Nigeria", "Ogun", R.drawable.farmer_with_tool));
        farmerList.add(new Farmer("Mr. Samson", "test@gmail.com", "2000-03-24", "Akoka street, Lagos, Nigeria", "Abuja", R.drawable.farmers));
        farmerList.add(new Farmer("Mrs. Grace", "test@gmail.com", "2000-03-24", "Akoka street, Lagos, Nigeria", "Lagos", R.drawable.ic_harvest));
        farmerList.add(new Farmer("Mr. Johnson", "test@gmail.com", "2000-03-24", "Akoka street, Lagos, Nigeria", "Lagos", R.drawable.agric_products));
        farmerList.add(new Farmer("Mr. Titus", "test@gmail.com", "2000-03-24", "Akoka street, Lagos, Nigeria", "Lagos", R.drawable.ic_person_green));
        farmerList.add(new Farmer("Mr. Abayomi", "test@gmail.com", "2000-03-24", "Akoka street, Lagos, Nigeria", "Lagos", R.drawable.ic_sprout));
        farmerList.add(new Farmer("Mr. Adeyemi", "test@gmail.com", "2000-03-24", "Akoka street, Lagos, Nigeria", "Ogun", R.drawable.farm_pic_show));
        farmerList.add(new Farmer("Mr. Abayomi", "test@gmail.com", "2000-03-24", "Akoka street, Lagos, Nigeria", "Lagos", R.drawable.farmer));
        farmerList.add(new Farmer("Mr. Adeyemi", "test@gmail.com", "2000-03-24", "Akoka street, Lagos, Nigeria", "Ogun", R.drawable.farmer_with_tool));
        farmerList.add(new Farmer("Mr. Samson", "test@gmail.com", "2000-03-24", "Akoka street, Lagos, Nigeria", "Abuja", R.drawable.farmers));
        farmerList.add(new Farmer("Mrs. Grace", "test@gmail.com", "2000-03-24", "Akoka street, Lagos, Nigeria", "Lagos", R.drawable.ic_harvest));
        farmerList.add(new Farmer("Mr. Johnson", "test@gmail.com", "2000-03-24", "Akoka street, Lagos, Nigeria", "Lagos", R.drawable.agric_products));
        farmerList.add(new Farmer("Mr. Titus", "test@gmail.com", "2000-03-24", "Akoka street, Lagos, Nigeria", "Lagos", R.drawable.ic_person_green));
        farmerList.add(new Farmer("Mr. Abayomi", "test@gmail.com", "2000-03-24", "Akoka street, Lagos, Nigeria", "Lagos", R.drawable.ic_sprout));
        farmerList.add(new Farmer("Mr. Adeyemi", "test@gmail.com", "2000-03-24", "Akoka street, Lagos, Nigeria", "Ogun", R.drawable.farm_pic_show));
        farmerList.add(new Farmer("Mr. Abayomi", "test@gmail.com", "2000-03-24", "Akoka street, Lagos, Nigeria", "Lagos", R.drawable.farmer));
        farmerList.add(new Farmer("Mr. Adeyemi", "test@gmail.com", "2000-03-24", "Akoka street, Lagos, Nigeria", "Ogun", R.drawable.farmer_with_tool));
        farmerList.add(new Farmer("Mr. Samson", "test@gmail.com", "2000-03-24", "Akoka street, Lagos, Nigeria", "Abuja", R.drawable.farmers));
        farmerList.add(new Farmer("Mrs. Grace", "test@gmail.com", "2000-03-24", "Akoka street, Lagos, Nigeria", "Lagos", R.drawable.ic_harvest));
        farmerList.add(new Farmer("Mr. Johnson", "test@gmail.com", "2000-03-24", "Akoka street, Lagos, Nigeria", "Lagos", R.drawable.agric_products));
        farmerList.add(new Farmer("Mr. Titus", "test@gmail.com", "2000-03-24", "Akoka street, Lagos, Nigeria", "Lagos", R.drawable.ic_person_green));
        farmerList.add(new Farmer("Mr. Abayomi", "test@gmail.com", "2000-03-24", "Akoka street, Lagos, Nigeria", "Lagos", R.drawable.ic_sprout));
        farmerList.add(new Farmer("Mr. Adeyemi", "test@gmail.com", "2000-03-24", "Akoka street, Lagos, Nigeria", "Ogun", R.drawable.farm_pic_show));


        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, farmerList);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(myAdapter);
    }


    //Menu code begins here
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_farmer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;

            case R.id.menu_add_farmer:
                Toast.makeText(FarmersBoardActivity.this, "Add Farmer Clicked", Toast.LENGTH_LONG).show();
                break;

            case R.id.menu_delete_farmer:
                Toast.makeText(FarmersBoardActivity.this, "Delete Farmer Clicked", Toast.LENGTH_LONG).show();
                break;

            default:
                return super.onOptionsItemSelected(item);
        }

        return super.onOptionsItemSelected(item);
    }
    //Menu code ends here

}
