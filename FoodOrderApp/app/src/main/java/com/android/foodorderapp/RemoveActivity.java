package com.android.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RemoveActivity extends AppCompatActivity {

    DBHelper DB;
    Button delete;
    EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remove);

        delete = findViewById(R.id.button);
        name = findViewById(R.id.editText);
        DB = new DBHelper(this);

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameTXT = name.getText().toString();
                Boolean checkudeletedata = DB.deletedata(nameTXT);
                if(checkudeletedata==true)
                    Toast.makeText(RemoveActivity.this, " Deleted", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(RemoveActivity.this, " Not Deleted", Toast.LENGTH_SHORT).show();
            }        });

    }
}