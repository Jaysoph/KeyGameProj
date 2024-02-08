package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class UserItem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_item);
        getSupportActionBar().hide();
        TextView tv = (TextView) findViewById(R.id.back);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(UserItem.this,User.class);
                Bundle order = new Bundle();
                order.putString("oder","1");
                i.putExtras(order);
                startActivity(i);
            }
        });
    }
}