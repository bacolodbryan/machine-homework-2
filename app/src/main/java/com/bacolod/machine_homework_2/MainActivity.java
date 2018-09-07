package com.bacolod.machine_homework_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ArrayList<Planet> planets = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.planet_gridview);

        planets.add(new Planet("Earth", "earth.jpg", "12,742KM", "STILL PART OF SOLAR SYSTEM"));
        planets.add(new Planet("Jupiter",  "jupiter.jpg","139,822 KM","STILL PART OF SOLAR SYSTEM"));
        planets.add(new Planet("Mars", "mars.jpg","6,779 KM","STILL PART OF SOLAR SYSTEM"));
        planets.add(new Planet("Mercury", "Mercury.jpg","4,879 KM","STILL PART OF SOLAR SYSTEM"));
        planets.add(new Planet("Neptune", "neptune.jpg","49,244 KM","STILL PART OF SOLAR SYSTEM"));
        planets.add(new Planet("Saturn", "saturn.jpg","116,464 KM","STILL PART OF SOLAR SYSTEM"));
        planets.add(new Planet("Uranus", "uranus.jpg","50,724 KM","STILL PART OF SOLAR SYSTEM"));
        planets.add(new Planet("Venus", "venus.jpg","12,104 KM","STILL PART OF SOLAR SYSTEM"));

        GridView planetGrid = findViewById(R.id.planet_gridView);
        PlanetAdapter adapter = new PlanetAdapter(this, R.layout.activity_main, planets);
        planetGrid.setAdapter(adapter);

        planetGrid.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextView planetTitle = view.findViewById(R.id.planet_title_textView);
        Toast.makeText(this, planetTitle.getText().toString(), Toast.LENGTH_LONG).show();
    }
}
