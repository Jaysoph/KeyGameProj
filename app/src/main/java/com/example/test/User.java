package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class User extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        ListView list = (ListView) findViewById(R.id.UserID);
        ListView list1 = (ListView) findViewById(R.id.Username);
        ArrayList<String> listItems = new ArrayList<String>();
        ArrayList<String> listItems1 = new ArrayList<String>();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.textcolor,listItems);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                R.layout.textcolor,listItems1);

        listItems.add("1");
        listItems1.add("Joseph");
        list.setAdapter(adapter);
        list1.setAdapter(adapter1);
        adapter.notifyDataSetChanged();
        adapter1.notifyDataSetChanged();
        getSupportActionBar().hide();

        TextView b = (TextView) findViewById(R.id.textkey);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(User.this, Adminpage.class);
                startActivity(i);
            }
        });

        Button se= (Button) findViewById(R.id.seemore);
        se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent see = new Intent(User.this,UserItem.class);
                startActivity(see);
            }
        });
    }
}