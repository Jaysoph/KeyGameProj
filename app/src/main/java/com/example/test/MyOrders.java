package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MyOrders extends AppCompatActivity {
    String id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_orders);
        ImageAdapter ia = new ImageAdapter(this);
        ImageView iv = (ImageView) findViewById(R.id.fImgView);


        String str[] = {"PlayerUnknown's Battlegrounds","Naraka","Hunt Showdown","Valheim"};
        String price[]={"B29","B25","B50","B27"};
        String code[]={"A1B2C3","D4E5F6","G7H8I9","J1K2L3"};
        TextView tv1 = (TextView)findViewById(R.id.nametxt);
        TextView tv2 = (TextView)findViewById(R.id.priceG);
        TextView tv3 = (TextView)findViewById(R.id.CodeNumber);
        getSupportActionBar().hide();
        id = getIntent().getStringExtra("ID");


        if(id.equals("1"))
        {
            iv.setImageResource(ia.mThumbIds[0]);
            tv1.setText(str[0]);
            tv2.setText(price[0]);
            tv3.setText(code[0]);

        }
        if(id.equals("2"))
        {

            iv.setImageResource(ia.mThumbIds[1]);
            tv1.setText(str[1]);
            tv2.setText(price[1]);
            tv3.setText(code[1]);

        }
        if(id.equals("3"))
        {

            iv.setImageResource(ia.mThumbIds[2]);
            tv1.setText(str[2]);
            tv2.setText(price[2]);
            tv3.setText(code[2]);

        }
        if(id.equals("4"))
        {

            iv.setImageResource(ia.mThumbIds[3]);
            tv1.setText(str[3]);
            tv2.setText(price[3]);
            tv3.setText(code[3]);

        }


        TextView tv = (TextView) findViewById(R.id.textkey);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MyOrders.this, Homepage.class);
                startActivity(i);

            }
        });
    }
}