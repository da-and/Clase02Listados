package com.example.autonoma.clase02_listados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvListados;
    ArrayList alumnos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvListados = findViewById(R.id.lvAlumnos);

        alumnos = new ArrayList<>();
        alumnos.add("Elvis");
        alumnos.add("Carlos");
        alumnos.add("Manuel");
        alumnos.add("Sixto");


        //creamos adaptador que usa los datos del array alumnos
        ArrayAdapter<String> adapter =  new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item,alumnos);

        //asignamos adaptador
        lvListados.setAdapter(adapter);

        lvListados.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,alumnos.get(position).toString(),String.valueOf(position),Toast.LENGTH_SHORT).show();
            }
        });

    }
}
