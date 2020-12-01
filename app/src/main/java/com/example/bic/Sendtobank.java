package com.example.bic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sendtobank extends AppCompatActivity {
    public Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sendtobank);
        spinner=findViewById(R.id.spinner);

        List<String > categories = new ArrayList<>();
        categories.add(0, "Choose type");
        categories.add("Loan");
        categories.add("Pawing");
        categories.add("Account");
        //style the spinner
        ArrayAdapter<String> adapter;
        adapter =new ArrayAdapter(this,android.R.layout.simple_spinner_item,categories);
        //dropdown layout style
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (Objects.equals(parent.getItemIdAtPosition(position), "Choose_type"))
                {
                    //do nothing
                }
                else
                {
                    //on selecting a spinner item
                    String item=parent.getItemAtPosition(position).toString();
                    // show selected spinner item
                    Toast.makeText(parent.getContext(),"Selected" + item,Toast.LENGTH_SHORT).show();
                    //anything else
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
};