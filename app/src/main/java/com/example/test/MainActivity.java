package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.loginbtn);
        EditText et = (EditText) findViewById(R.id.login);
        getSupportActionBar().hide();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id =et.getText().toString();
                if(id.equals("Admin")){
                    Intent admin = new Intent(MainActivity.this,Adminpage.class);
                    Bundle adminz = new Bundle();
                    adminz.putString("ID","1");
                    admin.putExtras(adminz);
                    startActivity(admin);

                }

                else if (id.equals("User"))
                {
                    Intent User = new Intent(MainActivity.this,Homepage.class);
                    Bundle user = new Bundle();
                    user.putString("ID","0");
                    User.putExtras(user);
                    startActivity(User);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "You did not enter a username", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}