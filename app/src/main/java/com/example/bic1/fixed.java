package com.example.bic1;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class fixed extends AppCompatActivity
{
    RecyclerView recview;
    com.example.bic1.Fixedadapter Fixedadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fixed);

        recview=(RecyclerView)findViewById(R.id.recview);
        recview.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<fixedmodel> options =
                new FirebaseRecyclerOptions.Builder<fixedmodel>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("students"), fixedmodel.class)
                        .build();

        Fixedadapter= new Fixedadapter(options, getApplicationContext());
        recview.setAdapter(Fixedadapter);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Fixedadapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Fixedadapter.stopListening();
    }
}
