package com.example.comoestate.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.comoestate.Domain.Item_Domain;
import com.example.comoestate.R;

public class ConActivity extends AppCompatActivity {
   Button Newsletter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_con);

        initView();

    }

    private void initView() {
        Newsletter =findViewById(R.id.Newsletter);
        Newsletter.setOnClickListener(v -> startActivity(new Intent(ConActivity.this,NewsletterActivity.class)));
    }

}