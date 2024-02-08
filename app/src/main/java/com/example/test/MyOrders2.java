package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MyOrders2 extends AppCompatActivity {
    String id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_orders2);
        id = getIntent().getStringExtra("ID");
        getSupportActionBar().hide();



        TextView tv = (TextView) findViewById(R.id.textkey);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                    Intent i = new Intent(MyOrders2.this, Homepage.class);
                    startActivity(i);


            }
        });
    }
}