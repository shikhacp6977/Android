package com.example.myapplication;


import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button button;

    boolean imageOne = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        button = findViewById(R.id.button);

        button.setOnClickListener(v -> {

            if (imageOne) {
                // Change img1 to img2
                imageView.setImageResource(R.drawable.img2);
                imageOne = false;

            } else {
                // Change img2 back to img1
                imageView.setImageResource(R.drawable.aimages);
                imageOne = true;
            }
        });
    }


}