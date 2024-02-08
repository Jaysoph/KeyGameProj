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

public class Homepage extends AppCompatActivity {
        SearchView searchView;
        ListView listView;

        ArrayList arrayList;
        ArrayAdapter adapter;
        String id,order;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        SearchView SV = (SearchView) findViewById(R.id.search);
        listView =findViewById(R.id.listView);
        listView.setVisibility(View.GONE);
        id = getIntent().getStringExtra("ID");
        order = getIntent().getStringExtra("order");
        GridView gv = (GridView) findViewById(R.id.gridView1);
        getSupportActionBar().hide();
        gv.setAdapter(new ImageAdapter(getApplicationContext()));

        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent= new Intent(Homepage.this,FullImg.class);
                intent.putExtra("id",i);
                startActivity(intent);
            }
        });
        SV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                listView.setVisibility(View.VISIBLE);

            }
        });
        arrayList= new ArrayList<>();

        arrayList.add("PUBG");
        arrayList.add("Naraka");
        arrayList.add("Hunt Showdown");
        arrayList.add("Valheim");


        adapter = new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(adapter);

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
                Intent User0 = new Intent(Homepage.this,Profilepage.class);
                Bundle user0 = new Bundle();
                user0.putString("ID","0");
                User0.putExtras(user0);
                startActivity(User0);

            }
        });
        TextView tvp = (TextView) findViewById(R.id.myprofile);
        tvp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent User = new Intent(Homepage.this,Profilepage.class);
                Bundle user = new Bundle();
                user.putString("ID","0");
                User.putExtras(user);
                startActivity(User);
            }
        });
        Button b1 = (Button) findViewById(R.id.buy1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent B1 = new Intent(Homepage.this,BuyActivity.class);
                Bundle extras =new Bundle();
                extras.putString("ID","1");
                B1.putExtras(extras);
                startActivity(B1);


            }
        });
        Button b2 = (Button) findViewById(R.id.buy2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent B2 = new Intent(Homepage.this,BuyActivity.class);
                Bundle extras =new Bundle();
                extras.putString("ID","2");
                B2.putExtras(extras);
                startActivity(B2);


            }
        });
        Button b3 = (Button) findViewById(R.id.buy3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent B3 = new Intent(Homepage.this,BuyActivity.class);
                    Bundle extras =new Bundle();
                    extras.putString("ID","3");
                    B3.putExtras(extras);
                    startActivity(B3);

            }
        });
        Button b4 = (Button) findViewById(R.id.buy4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent B4 = new Intent(Homepage.this,BuyActivity.class);
                Bundle extras =new Bundle();
                extras.putString("ID","4");
                B4.putExtras(extras);
                startActivity(B4);


            }
        });

        TextView tvo = (TextView) findViewById(R.id.myorders);
        tvo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tk = new Intent(Homepage.this,MyOrders2.class);
                Bundle tkk = new Bundle();
                tkk.putString("ID","0");
                tk.putExtras(tkk);
                startActivity(tk);
            }
        });


    }
}