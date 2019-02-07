package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MyViewHolder> {
    private Context context ;
    private ArrayList<MainListItem> mDataset;

    MainAdapter(Context context, ArrayList<MainListItem> mDataset){
        this.context = context;
        this.mDataset = mDataset;
    }

    @NonNull
    @Override
    public MainAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.main_list_item,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainAdapter.MyViewHolder myViewHolder, int i) {
        MainListItem object = mDataset.get(i);
        object.setMagnitude(object.getMagnitude());
        object.setLocation(object.getLocation());
        object.setDate(object.getDate());

        // OnClickListener must be implemented here
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView location, magnitude, date;

        MyViewHolder(View itemView) {
            super(itemView);

            this.location = itemView.findViewById(R.id.location);
            this.magnitude = itemView.findViewById(R.id.magnitude);
            this.date = itemView.findViewById(R.id.date);
        }
    }

}
