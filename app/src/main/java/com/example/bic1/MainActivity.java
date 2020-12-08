package com.example.bic1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import static com.example.bic1.R.id.account;

public class MainActivity extends AppCompatActivity {
    Button account, loan, pawning, admin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        account = (Button) findViewById(R.id.account);
        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, Savings.class);
                startActivity(a);
                finish();
            }
        });


    }
}



//        loan = (Button) findViewById(R.id.loan);
//        loan.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent a = new Intent(MainActivity.this, Loan.class);
//                startActivity(a);
//                finish();
//            }
//        });
//    }
//}




//        account=(Button)findViewById(R.id.account);
//        account.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent b = new Intent(MainActivity.this, Account.class);
//                startActivity(b);
//                finish();
//            }
//        });
//        loan=(Button) findViewById(R.id.loan);
//        loan.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent c = new Intent(MainActivity.this, Loan.class);
//                startActivity(c);
//                finish();
//            }
//        });
//

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
//    }
//}