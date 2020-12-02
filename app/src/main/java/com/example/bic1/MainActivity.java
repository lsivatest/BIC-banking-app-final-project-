package com.example.bic1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView pawning;
    Button admin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        admin=(Button)findViewById(R.id.admin);
        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, Admin.class);
                startActivity(a);
                finish();
            }
        });
        pawning=(TextView) findViewById(R.id.pawning);
        pawning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(MainActivity.this,Pawning.class);
                startActivity(b);
                finish();
            }
        });

//
//        loan =(TextView) findViewById(R.id.loan);
//        loan.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent d = new Intent(MainActivity.this,Loan.class);
//                startActivity(d);
//                finish();
//            }
//        });



        /*Account = (TextView) findViewById(R.id.account);
        login = (Button) findViewById(R.id.login);
        Register = (Button) findViewById(R.id.register);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, Login.class);
                startActivity(a);
                finish();

            }
        });

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, Register.class);
                startActivity(a);
                finish();
            }
        });

        Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, Savings.class);
                startActivity(a);
                finish();
            }
        });*/
    }
}