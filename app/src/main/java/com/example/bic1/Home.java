package com.example.bic1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Home extends AppCompatActivity  implements  View.OnClickListener{
    CardView cardhome;
    CardView cardabout;
    CardView cardsend;
    CardView cardsettings;
    CardView cardinbox;
    CardView cardshare;

    public CardView card1,card2,card3,card4,card5,card6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        card1 = (CardView) findViewById(R.id.cardhome);
        card2 = (CardView) findViewById(R.id.cardabout);
        card3 = (CardView) findViewById(R.id.cardsend);
        card4 = (CardView) findViewById(R.id.cardshare);
        card5 = (CardView) findViewById(R.id.cardsettings);
        card6 = (CardView) findViewById(R.id.cardinbox);

        card1.setOnClickListener(this);
        card1.setOnClickListener(this);
        card1.setOnClickListener(this);
        card1.setOnClickListener(this);
        card1.setOnClickListener(this);
        card1.setOnClickListener(this);


        cardhome = findViewById(R.id.cardhome);
        cardabout = findViewById(R.id.cardabout);
        cardsend = findViewById(R.id.cardsend);
        cardshare = findViewById(R.id.cardshare);
        cardsettings = findViewById(R.id.cardsettings);
        cardinbox = findViewById(R.id.cardinbox);

        cardhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("HOME CLick");
                Intent i = new Intent(Home.this,MainActivity.class);
                startActivity(i);

            }
        });
        cardabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("About CLick");
                Intent i = new Intent(Home.this,MainActivity.class);
                startActivity(i);

            }
        });
        cardshare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Share CLick");

            }
        });
        cardsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Send CLick");

            }
        });
        cardsettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Settings CLick");

            }
        });
        cardinbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });


    }

    private  void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();

    }



    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.cardhome:
                i=new Intent(Home.this,MainActivity.class);
                startActivity(i);
                break;

        }

    }


}
