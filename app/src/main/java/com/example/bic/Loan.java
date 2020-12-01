package com.example.bic;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class Loan  extends AppCompatActivity {
    private Spinner spinner;
    private Button button;
    private  String[] listitems;
    @Override
    protected  void  onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan);
        listitems=getResources().getStringArray(R.array.LoanType);
        spinner=findViewById(R.id.spinner);
        button=findViewById(R.id.getvalue);
        ArrayAdapter adapter=new ArrayAdapter(Loan.this,android.R.layout.simple_spinner_item,listitems);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

}
