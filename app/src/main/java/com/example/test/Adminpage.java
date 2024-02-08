package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Adminpage extends AppCompatActivity {
    SearchView searchView;
    ListView listView;

    ArrayList arrayList;
    ArrayAdapter adapter;
    String id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminpage);
        SearchView SV = (SearchView) findViewById(R.id.search);
        listView =findViewById(R.id.listView);
        listView.setVisibility(View.GONE);
        id = getIntent().getStringExtra("ID");
        getSupportActionBar().hide();
        SV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                listView.setVisibility(View.VISIBLE);
            }
        });

        SV.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {


                adapter.getFilter().filter(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String nextText) {
                adapter.getFilter().filter(nextText);
                return false;
            }
        });


        ImageButton ibtn = (ImageButton) findViewById(R.id.profilebtn);
        ibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Admin1 = new Intent(Adminpage.this,Profilepage.class);
                Bundle admin1 = new Bundle();
                admin1.putString("ID","1");
                Admin1.putExtras(admin1);
                startActivity(Admin1);

            }
        });
        TextView tvp = (TextView) findViewById(R.id.myprofile);
        tvp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Admin = new Intent(Adminpage.this,Profilepage.class);
                Bundle admin = new Bundle();
                admin.putString("ID","1");
                Admin.putExtras(admin);
                startActivity(Admin);

            }
        });

        TextView tvo = (TextView) findViewById(R.id.myorders);
        tvo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tk = new Intent(Adminpage.this,Listgame.class);
                Bundle tkk = new Bundle();
                tkk.putString("ID","1");
                tk.putExtras(tkk);
                startActivity(tk);
            }
        });

        TextView add = (TextView) findViewById(R.id.addoders);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ad = new Intent(Adminpage.this,AddOrders.class);
                startActivity(ad);
            }
        });

        TextView user = (TextView) findViewById(R.id.user);
        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent us = new Intent(Adminpage.this,User.class);
                startActivity(us);
            }
        });


    }
}