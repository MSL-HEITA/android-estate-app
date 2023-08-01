package com.example.comoestate.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.comoestate.Domain.Item_Domain;
import com.example.comoestate.R;

import java.text.DecimalFormat;

public class DetailActivity extends AppCompatActivity {
private TextView title,location,bed,bath,wifi,description,price;
private Item_Domain items;
private ImageView pic;
    private Item_Domain Items;
    private Button buy_Now;
    private Button Fbutton;
    private ConstraintLayout house;

    DecimalFormat formatter=new DecimalFormat("###,###,###,##");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        initView();
        setVariable();

    }


    private void setVariable() {
        items= (Item_Domain) getIntent().getSerializableExtra("object");

        title.setText(items.getTitle());
        location.setText(items.getAddress());
        bed.setText(items.getBed() +"bed");
        bath.setText(items.getBath() +"bath");
        description.setText(items.getDescription());
        price.setText("N$" +formatter.format(items.getPrice()));

        if (items.isWifi()){
            wifi.setText("wifi");
        }else {
            wifi.setText("no-wifi");
        }

        int drawableResourceId=getResources().getIdentifier(items.getPic(),"drawable",getPackageName());

        Glide.with(this)
                .load(drawableResourceId)
                .into(pic);
    }

    private void initView() {
        title =findViewById(R.id.title);
        location =findViewById(R.id.location);
        bed =findViewById(R.id.bed);
        bath =findViewById(R.id.bath);
        wifi =findViewById(R.id.wifi);
        description =findViewById(R.id.description);
        pic =findViewById(R.id.pic);
        price=findViewById(R.id.price);


        buy_Now =findViewById(R.id.buy_Now);
        buy_Now.setOnClickListener(v -> startActivity(new Intent(DetailActivity.this,ConActivity.class)));
    }




}