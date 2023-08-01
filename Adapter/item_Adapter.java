package com.example.comoestate.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.comoestate.Activities.DetailActivity;
import com.example.comoestate.Domain.Item_Domain;
import com.example.comoestate.R;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class item_Adapter extends RecyclerView.Adapter<item_Adapter.ViewHolder>{
ArrayList<Item_Domain>items;
DecimalFormat formatter;
Context context;

    public item_Adapter(ArrayList<Item_Domain> items) {
        this.items = items;
        formatter=new DecimalFormat("####,####,####,####.##");
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate= LayoutInflater.from(parent.getContext() ).inflate(R.layout.itemview_holder,parent,false);
        context =parent.getContext();
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.titleText.setText(items.get(position).getTitle());
        holder.addressTxt.setText(items.get(position).getAddress());
        holder.priceText.setText('$'+ formatter.format(items.get(position).getPrice()));
        int drawableResouceId=holder.itemView.getResources().getIdentifier(items.get(position).getPic(),"drawable",holder.itemView.getContext().getPackageName());
        Glide.with(holder.itemView.getContext())
                .load(drawableResouceId)
                .into(holder.pic);
        holder.itemView.setOnClickListener(view -> {
          Intent intent=new Intent(context, DetailActivity.class);
          intent.putExtra("object",items.get(position));
          context.startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView titleText,addressTxt,priceText;

        ImageView pic;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            titleText=itemView.findViewById(R.id.titleText);
            addressTxt=itemView.findViewById(R.id.addressTxt);
            priceText=itemView.findViewById(R.id.priceText);
            pic=itemView.findViewById(R.id.pic);
        }
    }
}
