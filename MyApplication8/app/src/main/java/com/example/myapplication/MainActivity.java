package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    TextView resultText;

    String[] fruits = {
            "select fruit",
            "apple",
            "banana",
            "mango",
            "oranges",
            "grapes"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner=findViewById(R.id.spinner);
        resultText=findViewById(R.id.resultText);

        ArrayAdapter<String> adapter=new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                fruits
        );
        adapter.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item
        );
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                        String selectedFruit = fruits[position];
                        if (position != 0) {
                            resultText.setText(
                                    "selected:" + selectedFruit

                            );
                            Toast.makeText(
                                    MainActivity.this,
                                    "you selected" + selectedFruit,
                                    Toast.LENGTH_SHORT
                            ).show();
                        }
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                      resultText.setText("nothing selected");
                    }
                }
        );
    }

}