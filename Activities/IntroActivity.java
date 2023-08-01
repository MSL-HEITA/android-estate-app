package com.example.comoestate.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.comoestate.R;

public class IntroActivity extends AppCompatActivity {
 private Button Begin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

       initView();
    }

    private void initView() {
        Begin =findViewById(R.id.begin);
        Begin.setOnClickListener(v -> startActivity(new Intent(IntroActivity.this,LogInActivity.class)));

    }
}