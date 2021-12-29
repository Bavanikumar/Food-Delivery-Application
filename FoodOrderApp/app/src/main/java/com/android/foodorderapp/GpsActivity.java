package com.android.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class GpsActivity extends AppCompatActivity {

    public TextView receiver_msg;
    public String s,s1,s2,s3,s4,s5,s6,s7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gps);

        receiver_msg = findViewById(R.id.textView);
        s = "Madurai";
        s1 = "Dindigul";
        s2 = "Tiruchchirapali";
        s3 = "Vridhachalam Junction";
        s4 = "Villuparam Junction";
        s5 = "Chengalpattu";
        s6 = "Tambaram";
        s7 = "Chennai Egmore";

        Intent intent = getIntent();

        String str = intent.getStringExtra("message_key");
        str = s;

        if(str.equals(s))
        {
            Intent a = new Intent(GpsActivity.this, SelectStationActivity.class);
            startActivity(a);

        }
        else  if(str.equals(s1))
        {
            Intent a = new Intent(GpsActivity.this, Selectstation2Activity.class);
            startActivity(a);

        }


    }
}