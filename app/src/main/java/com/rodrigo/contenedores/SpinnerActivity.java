package com.rodrigo.contenedores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class SpinnerActivity extends AppCompatActivity {

    Spinner spinner_xml, spinner_java;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        spinner_xml = findViewById(R.id.spinner_xml);
        spinner_java = findViewById(R.id.spinner_java);

        ArrayAdapter<CharSequence> adaptador =
                ArrayAdapter.createFromResource(SpinnerActivity.this,R.array.planets_array,
                        android.R.layout.simple_spinner_item);
        spinner_xml.setAdapter(adaptador);


        ArrayList<String> ciudades = new ArrayList<>();
        ciudades.add("Santiago");
        ciudades.add("Concepcion");
        ciudades.add("Temuco");
        ArrayAdapter<String> adaptador2 = new ArrayAdapter<>(SpinnerActivity.this,
                android.R.layout.simple_spinner_item,ciudades);

        spinner_java.setAdapter(adaptador2);
    }
}