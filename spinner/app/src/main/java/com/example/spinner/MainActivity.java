package com.example.spinner;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Spinner country;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        country=findViewById(R.id.spinnerCountry);
        String[] countries={"Select a country","Canada","India","America","London","Japan","Korea","France"};

        ArrayAdapter<String>adapter=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,countries);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        country.setAdapter(adapter);

        country.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selected= parent.getSelectedItem().toString();
                Toast.makeText(MainActivity.this,  "selected country :"+ selected,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(MainActivity.this,"Nothing selected",Toast.LENGTH_SHORT).show();
            }
        });
    }
}