package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Payment2 extends AppCompatActivity {
    String id,login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment2);
        TextView tv = (TextView) findViewById(R.id.backPay);
        TextView tv1 = (TextView) findViewById(R.id.price);
        String price[] = {"B29", "B25", "B50", "B27"};
        id = getIntent().getStringExtra("ID");

        if (id.equals("1")) {
            tv1.setText(price[0]);
        }
        if (id.equals("2")) {
            tv1.setText(price[1]);
        }
        if (id.equals("3")) {
            tv1.setText(price[2]);
        }
        if (id.equals("4")) {
            tv1.setText(price[3]);
        }
            tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent b = new Intent(Payment2.this, Payment.class);
                    startActivity(b);
                }
            });
        getSupportActionBar().hide();

        Button b =(Button) findViewById(R.id.paynow);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bn = new Intent(Payment2.this,MyOrders.class);

                if (id.equals("1"))
                {
                    Bundle pp =new Bundle();
                    pp.putString("ID","1");
                    bn.putExtras(pp);
                    startActivity(bn);

                }
                if (id.equals("2"))
                {
                    Bundle pp =new Bundle();
                    pp.putString("ID","2");
                    bn.putExtras(pp);
                    startActivity(bn);
                }
                if (id.equals("3"))
                {
                    Bundle pp =new Bundle();
                    pp.putString("ID","3");
                    bn.putExtras(pp);
                    startActivity(bn);
                }
                if (id.equals("4"))
                {
                    Bundle pp =new Bundle();
                    pp.putString("ID","4");
                    bn.putExtras(pp);
                    startActivity(bn);
                }


            }

        });

    }
}