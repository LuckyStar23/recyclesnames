package com.example.recyclesnames;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycles);
        ArrayList<String> names = new ArrayList<>();
        names.add("Avatar");
        names.add("Avatar");
        names.add("Avatar");
        names.add("Avatar");
        names.add("Avatar");
        names.add("Avatar");
        names.add("Avatar");
        names.add("Avatar");
        names.add("Avatar");
        names.add("Avatar");
        names.add("Avatar");
        names.add("Avatar");
        names.add("Avatar");
        names.add("Avatar");
        names.add("Avatar");
        names.add("Avatar");
        names.add("Avatar");
        names.add("Avatar");
        names.add("Avatar");
        names.add("Avatar");
        names.add("Avatar");
        names.add("Avatar");
        names.add("Avatar");

        NamesAdapter adapter = new NamesAdapter(names);
        recyclerView.setAdapter(adapter);

    }
}