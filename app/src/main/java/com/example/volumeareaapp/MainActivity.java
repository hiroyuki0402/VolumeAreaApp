package com.example.volumeareaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    ArrayList<ItemModel> items;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items = new ArrayList<ItemModel>();

        gridView = findViewById(R.id.gridView3);


        ItemModel item1 = new ItemModel(R.drawable.sphere, "Sphere");
        ItemModel item2 = new ItemModel(R.drawable.cylinder, "Cylinder");
        ItemModel item3 = new ItemModel(R.drawable.cube, "Cube");
        ItemModel item4 = new ItemModel(R.drawable.prism, "Prism");
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);

        adapter = new Adapter(items, getApplicationContext());
        gridView.setAdapter(adapter);
        gridView.setNumColumns(2);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), Sphere.class);
                startActivity(intent);


            }
        });
    }
}