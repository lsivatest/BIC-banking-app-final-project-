package com.example.bic1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Admin extends AppCompatActivity {
    TextView adminlogin,adminregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        adminlogin = (TextView) findViewById(R.id.adminlogin);
        adminlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Admin.this, Adminlogin.class);
                startActivity(a);
                finish();
            }
        });

        adminregister = (TextView) findViewById(R.id.adminregister);
        adminregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Admin.this, Admincreate.class);
                startActivity(a);
                finish();
            }
        });
    }
}