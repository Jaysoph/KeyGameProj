package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class AddOrders extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_orders);
        ListView list = (ListView) findViewById(R.id.ListView);
        ListView list1 = (ListView) findViewById(R.id.ListView1);
        ListView list2 = (ListView) findViewById(R.id.ListViewid);
        getSupportActionBar().hide();
        ArrayList<String> listItems = new ArrayList<String>();
        ArrayList<String> listItems1 = new ArrayList<String>();
        ArrayList<String> listItems2 = new ArrayList<String>();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.textcolor,listItems);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                R.layout.textcolor,listItems1);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,
                R.layout.textcolor,listItems2);


        list.setAdapter(adapter);
        list1.setAdapter(adapter1);
        list2.setAdapter(adapter2);
        adapter.notifyDataSetChanged();
        adapter1.notifyDataSetChanged();
        adapter2.notifyDataSetChanged();

        Button btn = (Button) findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText et = findViewById(R.id.et);
                EditText et1 = findViewById(R.id.et1);
                EditText et2 = findViewById(R.id.et2);
                listItems.add(et.getText().toString());
                listItems1.add(et1.getText().toString());
                listItems2.add(et2.getText().toString());
                adapter.notifyDataSetChanged();
                adapter1.notifyDataSetChanged();
                adapter2.notifyDataSetChanged();
                et.setText("");
                et1.setText("");
                et2.setText("");
            }
        });
       list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               listItems.remove(i);
               listItems1.remove(i);
               listItems2.remove(i);
               list.setAdapter(adapter);
               list1.setAdapter(adapter1);
               list2.setAdapter(adapter2);
               Toast.makeText(AddOrders.this, "Remove", Toast.LENGTH_SHORT).show();
           }
       });
        TextView b = (TextView) findViewById(R.id.textkey);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AddOrders.this, Adminpage.class);
                startActivity(i);
            }
        });
    }
}