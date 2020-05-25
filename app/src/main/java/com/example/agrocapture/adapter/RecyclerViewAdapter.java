package com.example.agrocapture.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.agrocapture.R;
import com.example.agrocapture.activity.ProfileActivity;
import com.example.agrocapture.model.Farmer;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mContext;
    private List<Farmer> mFarmer;

    public RecyclerViewAdapter(Context mContext, List<Farmer> mFarmer) {
        this.mContext = mContext;
        this.mFarmer = mFarmer;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item_farmer, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        holder.txt_farmer.setText(mFarmer.get(position).getFarmer_name());
        holder.txt_email.setText(mFarmer.get(position).getEmail());
        holder.txt_address.setText(mFarmer.get(position).getAddress());
        holder.img_farmer_thumbnail.setImageResource(mFarmer.get(position).getThumbnail());
        //Set CLickListener on cardView items
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Pass the required Data
                Intent intent = new Intent(mContext, ProfileActivity.class);
                intent.putExtra("Name", mFarmer.get(position).getFarmer_name());
                intent.putExtra("Email", mFarmer.get(position).getEmail());
                intent.putExtra("Address", mFarmer.get(position).getAddress());
                intent.putExtra("Thumbnail", mFarmer.get(position).getThumbnail());
                //Start the ProfileActivity
                mContext.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return mFarmer.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView txt_farmer, txt_email, txt_address;
        ImageView img_farmer_thumbnail;
        CardView cardView;

        public MyViewHolder(View itemView) {
            super(itemView);

            txt_farmer = itemView.findViewById(R.id.txt_name);
            txt_email = itemView.findViewById(R.id.txt_email);
            txt_address = itemView.findViewById(R.id.txt_address);
            img_farmer_thumbnail = itemView.findViewById(R.id.img_farmer);
            cardView = itemView.findViewById(R.id.cardview_id);

        }
    }

}
