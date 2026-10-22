package com.example.arrayadapter;

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

        try {
            setContentView(R.layout.activity_main);

            listView = findViewById(R.id.listView);

            if (listView == null) {
                throw new NullPointerException("ListView not found in activity_main.xml");
            }

            ArrayAdapter<String> adapter = new ArrayAdapter<>(
                    this,
                    android.R.layout.simple_list_item_1,
                    fruits
            );

            listView.setAdapter(adapter);

        } catch (NullPointerException e) {
            Toast.makeText(
                    this,
                    "Error: ListView not found.",
                    Toast.LENGTH_LONG
            ).show();

            e.printStackTrace();

        } catch (Exception e) {
            Toast.makeText(
                    this,
                    "An unexpected error occurred.",
                    Toast.LENGTH_LONG
            ).show();

            e.printStackTrace();
        }
    }
}
