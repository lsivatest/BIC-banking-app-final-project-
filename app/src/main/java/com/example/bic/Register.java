package com.example.bic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.util.Patterns.*;


public class Register extends AppCompatActivity {

    EditText us,ps,em,ad,mo;
    String username;
    String password;
    String email;
    String address;
    String mobile;

    Button create;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        us = (EditText) findViewById(R.id.username);
        ps = (EditText) findViewById(R.id.password);
        em = (EditText) findViewById(R.id.email);
        ad = (EditText) findViewById(R.id.address);
        mo = (EditText) findViewById(R.id.mobile);

        create = (Button) findViewById(R.id.create);

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                create();
            }
        });
        create.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                username = password = email = address = mobile = "" ;
            }
        });
    }


    public void create() {

        initialize();
        if (!validate()) {
            Toast.makeText(this, "Üser Registration Failed", Toast.LENGTH_SHORT).show();
        } else {
            onCreateSuccess();
        }
    }

    public void onCreateSuccess() {
        Toast.makeText(this, "User Registration Successful!", Toast.LENGTH_SHORT).show();
        username = password = email = address = mobile = "";
    }


    public boolean validate() {

        boolean val = true;

        if(username.isEmpty()) {
            us.setError("username can't be blank");
            us.requestFocus();
            val = false;
        }
        if(password.isEmpty()) {
            ps.setError("password can't be balnk");
            ps.requestFocus();
            val = false;
        }
        if(email.isEmpty()) {
            em.setError("email can't be balnk");
            em.requestFocus();
            val = false;
        }
        if(address.isEmpty()) {
            ad.setError("address can't be balnk");
            ad.requestFocus();
            val = false;
        }
        if(mobile.isEmpty()) {
            mo.setError("mobile can't be balnk");
            mo.requestFocus();
            val = false;
        }

        if (EMAIL_ADDRESS.matcher(email).matches()) {
            em.setError("Please enter the valid email address");
            em.requestFocus();
            val = false;
        }

        /*if (Patterns.EMAIL_ADDRESS().matches()) {
            em.setError("Please enter the valid email address");
            em.requestFocus();
            val = false;
        }*/

        if(password.length()<8){
            ps.setError("password can't be lessthan 8 characters");
            ps.requestFocus();
            val = false;
        }
        return val;


    }

    public void initialize() {
        username = us.getText().toString().trim();
        password = ps.getText().toString().trim();
        email = em.getText().toString().trim();
        address = ad.getText().toString().trim();
        mobile = mo.getText().toString().trim();
    }
}
