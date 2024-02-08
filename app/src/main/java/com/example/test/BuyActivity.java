package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class BuyActivity extends AppCompatActivity {
    String id,login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);
        ImageAdapter ia = new ImageAdapter(this);
        String str[] = {"PlayerUnknown's Battlegrounds","Naraka","Hunt Showdown","Valheim"};
        String price[]={"B29","B25","B50","B27"};
        ImageView iv = (ImageView) findViewById(R.id.fImgView);
        TextView tv1 =(TextView)findViewById(R.id.pricetxt);
        TextView tv =(TextView)findViewById(R.id.nametxt);
        id = getIntent().getStringExtra("ID");
        login = getIntent().getStringExtra("num");
        getSupportActionBar().hide();

        if(id.equals("1"))
        {
            iv.setImageResource(ia.mThumbIds[0]);
            tv.setText(str[0]);
            tv1.setText(price[0]);

        }
        if(id.equals("2"))
        {
            iv.setImageResource(ia.mThumbIds[1]);
            tv.setText(str[1]);
            tv1.setText(price[1]);

        }
        if(id.equals("3"))
        {
            iv.setImageResource(ia.mThumbIds[2]);
            tv.setText(str[2]);
            tv1.setText(price[2]);

        }
        if(id.equals("4"))
        {
            iv.setImageResource(ia.mThumbIds[3]);
            tv.setText(str[3]);
            tv1.setText(price[3]);

        }

        TextView  TVB =(TextView)findViewById(R.id.backHP);
        TVB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent b = new Intent(BuyActivity.this,Homepage.class);
                startActivity(b);

            }
        });

        Button btn = (Button) findViewById(R.id.bn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bn = new Intent(BuyActivity.this,Payment.class);
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
                    Bundle adminz = new Bundle();
                    adminz.putString("num","1");
                    bn.putExtras(adminz);
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