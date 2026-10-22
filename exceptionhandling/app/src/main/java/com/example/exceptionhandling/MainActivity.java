package com.example.exceptionhandling;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String[] fruits = {
            "Apple",
            "Banana",
            "Mango",
            "Orange",
            "Grapes"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            listView = findViewById(R.id.listView);

            if (listView == null) {
                throw new Exception("ListView not found");
            }

            ArrayAdapter<String> adapter = new ArrayAdapter<>(
                    this,
                    android.R.layout.simple_list_item_1,
                    fruits
            );

            listView.setAdapter(adapter);

        } catch (Exception e) {
            Toast.makeText(
                    this,
                    "Error: " + e.getMessage(),
                    Toast.LENGTH_LONG
            ).show();

            e.printStackTrace();
        }
    }
}
