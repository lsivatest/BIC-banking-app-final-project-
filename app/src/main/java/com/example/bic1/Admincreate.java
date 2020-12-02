package com.example.bic1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Admincreate extends AppCompatActivity {
    EditText username, password, email, address, mobile;
    Button confirm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        email = (EditText) findViewById(R.id.email);
        address = (EditText) findViewById(R.id.address);
        mobile = (EditText) findViewById(R.id.mobile);
        confirm = (Button) findViewById(R.id.create);

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals("")) {
                    username.setError("Enter valid username");
                } else if (password.getText().toString().equals("")) {
                    password.setError("Enter valid password");
                } else if (address.getText().toString().equals("")) {
                    address.setError("Enter valid address");
                } else if (mobile.getText().toString().equals("")) {
                    mobile.setError("Enter valid mobile");
                } else {
                    mobile.setError("Enter valid mobile");
                }
            }
        });
    }
}