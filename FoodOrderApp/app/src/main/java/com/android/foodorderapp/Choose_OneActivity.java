package com.android.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Choose_OneActivity extends AppCompatActivity {


    public void chef(View v) {
        Intent in = new Intent(this, ChefLoginActivity.class);
        startActivity(in);
    }

    public void customer(View v) {
        Intent in = new Intent(this, LoginActivity.class);
        startActivity(in);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_one);


    }
}