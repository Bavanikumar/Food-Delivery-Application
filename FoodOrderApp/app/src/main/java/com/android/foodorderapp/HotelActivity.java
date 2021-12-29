package com.android.foodorderapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HotelActivity extends AppCompatActivity {

    DBHelper DB;
    Button view;
    EditText inputHotelName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);

        inputHotelName = (EditText) findViewById(R.id.editText);
        view = (Button) findViewById(R.id.getorders);

        DB = new DBHelper(this);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameTXT = inputHotelName.getText().toString();
                Cursor res = DB.getdata(nameTXT);
                if(res.getCount()==0){
                    Toast.makeText(HotelActivity.this, "No Orders Exists", Toast.LENGTH_SHORT).show();
                    return;
                }
                StringBuffer buffer = new StringBuffer();
                while(res.moveToNext()){
                    buffer.append("Name :"+res.getString(0)+"\n");
                    buffer.append("Phone number :"+res.getString(1)+"\n");
                    buffer.append("Hotel name :"+res.getString(2)+"\n");
                    buffer.append("Coach and seat number :"+res.getString(3)+"\n");
                    buffer.append("item :"+res.getString(4)+"\n");
                    buffer.append("qty :"+res.getString(5)+"\n\n");
                }

                AlertDialog.Builder builder = new AlertDialog.Builder(HotelActivity.this);
                builder.setCancelable(true);
                builder.setTitle("User Entries");
                builder.setMessage(buffer.toString());
                builder.show();
            }        });


    }
    public void next(View v)
    {
        Intent intent = new Intent(this, RemoveActivity.class);
        startActivity(intent);
    }
}