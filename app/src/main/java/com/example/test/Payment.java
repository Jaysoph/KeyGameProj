 package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

 public class Payment extends AppCompatActivity {
    String id,login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        id = getIntent().getStringExtra("ID");


        TextView tv = (TextView) findViewById(R.id.backP);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(Payment.this,Homepage.class);
                startActivity(b);
            }
        });
        getSupportActionBar().hide();
        Button btn = (Button) findViewById(R.id.add);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Payment.this,Payment2.class);
                Bundle price2 = new Bundle();
                if(id.equals("1")){

                    price2.putString("ID","1");
                    a.putExtras(price2);
                    startActivity(a);


                }
                if(id.equals("2")){

                    price2.putString("ID","2");
                    a.putExtras(price2);
                    startActivity(a);

                }
                if(id.equals("3")){

                    price2.putString("ID","3");
                    a.putExtras(price2);
                    startActivity(a);

                }
                if(id.equals("4")){

                    price2.putString("ID","4");
                    a.putExtras(price2);
                    startActivity(a);

                }

            }
        });
    }
}