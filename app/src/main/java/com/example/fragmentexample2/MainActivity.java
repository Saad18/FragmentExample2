package com.example.fragmentexample2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    Context context;
    private ArrayList<String> planets = new ArrayList<>(Arrays.asList("Marcury", "Venus", "Earth", "March", "Volcano", "Neptune", "Plateo", "Uranus", "Venus","Marcury","Venus","Earth","March","Volcano"));


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

       ListAdapter listAdapter = new ListAdapter(context,planets);
       recyclerView.setAdapter(listAdapter);
       recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
