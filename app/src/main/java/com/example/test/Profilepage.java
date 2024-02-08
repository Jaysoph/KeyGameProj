package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Profilepage extends AppCompatActivity {
    String id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profilepage);
        TextView  TV =(TextView)findViewById(R.id.backH);
        TextView  TV1 =(TextView)findViewById(R.id.username);
        TextView  TV2 =(TextView)findViewById(R.id.email);
        getSupportActionBar().hide();
        id = getIntent().getStringExtra("ID");
        String str[] ={"Joseph","admin"};
        String email[]={"jaysophz1234@gmai.com","admin1234@gmail.com"};

        if(id.equals("0")){
            TV1.setText(str[0]);
            TV2.setText(email[0]);

        }
        if(id.equals("1")){
            TV1.setText(str[1]);
            TV2.setText(email[1]);

        }
        TV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(id.equals("0")){
                    Intent b = new Intent(Profilepage.this,Homepage.class);
                    startActivity(b);
                }
                if(id.equals("1")){
                    Intent a = new Intent(Profilepage.this,Adminpage.class);
                    startActivity(a);
                }

            }
        });

    }
}