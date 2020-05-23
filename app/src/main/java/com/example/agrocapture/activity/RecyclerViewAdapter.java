package com.example.agrocapture.activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.agrocapture.R;
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
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.txt_farmer.setText(mFarmer.get(position).getFarmer_name());
        holder.txt_email.setText(mFarmer.get(position).getEmail());
        holder.img_farmer_thumbnail.setImageResource(mFarmer.get(position).getThumbnail());

    }

    @Override
    public int getItemCount() {
        return mFarmer.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView txt_farmer;
        TextView txt_email;
        ImageView img_farmer_thumbnail;

        public MyViewHolder(View itemView) {
            super(itemView);

            txt_farmer = itemView.findViewById(R.id.txt_name);
            txt_email = itemView.findViewById(R.id.txt_email);
            img_farmer_thumbnail = itemView.findViewById(R.id.img_farmer);

        }
    }

}
