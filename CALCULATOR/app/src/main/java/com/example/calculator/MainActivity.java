package com.example.calculator;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText n1, n2;
    Button sum, sub, mul, div;
    TextView rslt;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find Views
        n1 = findViewById(R.id.first);
        n2 = findViewById(R.id.second);

        sum = findViewById(R.id.sum);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);

        rslt = findViewById(R.id.rslt);

        // Addition
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f1 = Integer.parseInt(n1.getText().toString());
                int f2 = Integer.parseInt(n2.getText().toString());

                int cal = f1 + f2;
                rslt.setText("Addition = " + cal);
            }
        });

        // Subtraction
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f1 = Integer.parseInt(n1.getText().toString());
                int f2 = Integer.parseInt(n2.getText().toString());

                int cal = f1 - f2;
                rslt.setText("Subtraction = " + cal);
            }
        });

        // Multiplication
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f1 = Integer.parseInt(n1.getText().toString());
                int f2 = Integer.parseInt(n2.getText().toString());

                int cal = f1 * f2;
                rslt.setText("Multiplication = " + cal);
            }
        });

        // Division
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f1 = Integer.parseInt(n1.getText().toString());
                int f2 = Integer.parseInt(n2.getText().toString());

                int cal = f1 / f2;
                rslt.setText("Division = " + cal);
            }
        });
    }
}
