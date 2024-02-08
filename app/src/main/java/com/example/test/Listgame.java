package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Listgame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_listgame);
        ListView list = (ListView) findViewById(R.id.ID);
        ListView list1 = (ListView) findViewById(R.id.Name);
        ListView list2 = (ListView) findViewById(R.id.Price);
        EditText e1 = (EditText)findViewById(R.id.Id);
        EditText e2 = (EditText)findViewById(R.id.nAme);
        EditText e3 = (EditText)findViewById(R.id.pRice);

        ArrayList<String> listItems = new ArrayList<String>();
        ArrayList<String> listItems1 = new ArrayList<String>();
        ArrayList<String> listItems2 = new ArrayList<String>();

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.textcolor,listItems);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                R.layout.textcolor,listItems1);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,
                R.layout.textcolor,listItems2);

        listItems.add("1");
        listItems.add("2");
        listItems.add("3");
        listItems.add("4");
        listItems1.add("PUBG");
        listItems1.add("Naraka");
        listItems1.add("Hunt Showdown");
        listItems1.add("Valheim");
        listItems2.add("B29");
        listItems2.add("B25");
        listItems2.add("B50");
        listItems2.add("B27");
        list.setAdapter(adapter);
        list1.setAdapter(adapter1);
        list2.setAdapter(adapter2);
        adapter.notifyDataSetChanged();
        adapter1.notifyDataSetChanged();
        adapter2.notifyDataSetChanged();
        getSupportActionBar().hide();


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                e1.setText(listItems.get(i));

            }
        });
        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                e2.setText(listItems1.get(i));

            }
        });
        list2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                e3.setText(listItems2.get(i));

            }
        });


        TextView b = (TextView) findViewById(R.id.back);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Listgame.this, Adminpage.class);
                startActivity(i);
            }
        });


    }
}