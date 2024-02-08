package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class FullImg extends AppCompatActivity {
    String login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_img);
        Intent i = getIntent();
        int pos = i.getExtras().getInt("id");

        ImageAdapter ia = new ImageAdapter(this);
        ImageView iv = (ImageView) findViewById(R.id.fImgView);
        iv.setImageResource(ia.mThumbIds[pos]);

        String str[] = {"PlayerUnknown's Battlegrounds","Naraka","Hunt Showdown","Valheim"};
        TextView tv =(TextView)findViewById(R.id.nametxt);
        tv.setText(str[pos]);
        String price[]={"B29","B25","B50","B27"};
        TextView tv1 =(TextView)findViewById(R.id.pricetxt);
        tv1.setText(price[pos]);
        TextView  TVB =(TextView)findViewById(R.id.backHP);
        getSupportActionBar().hide();
        TVB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent b = new Intent(FullImg.this,Homepage.class);
                startActivity(b);

            }
        });

        Button b = (Button) findViewById(R.id.buybutton);
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent pay = new Intent(FullImg.this,Payment.class);
                if(pos==0){

                    Bundle price = new Bundle();
                    price.putString("ID","1");
                    pay.putExtras(price);
                    startActivity(pay);

                }
                if(pos==1){

                    Bundle price = new Bundle();
                    price.putString("ID","2");
                    pay.putExtras(price);
                    startActivity(pay);

                }
                if(pos==2){

                    Bundle price = new Bundle();
                    price.putString("ID","3");
                    pay.putExtras(price);
                    startActivity(pay);

                }
                if(pos==3){

                    Bundle price = new Bundle();
                    price.putString("ID","4");
                    pay.putExtras(price);
                    startActivity(pay);

                }


            }
        });
    }
}