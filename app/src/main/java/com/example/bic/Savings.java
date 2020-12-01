package com.example.bic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Savings extends AppCompatActivity {
    TextView savings,fixed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_savings);
        savings = (TextView) findViewById(R.id.saving);
        savings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Savings.this, savingdetils.class);
                startActivity(a);
                finish();
            }
        });

    }
}