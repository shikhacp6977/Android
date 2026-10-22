package com.example.grid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText n1, n2;
    TextView result;
    Button add, sub, mul, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);

        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);

        result = findViewById(R.id.result);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int f1 = Integer.parseInt(n1.getText().toString());
                int f2 = Integer.parseInt(n2.getText().toString());

                int cal = f1 + f2;

                result.setText("Addition = " + cal);
            }
        });


        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int f1 = Integer.parseInt(n1.getText().toString());
                int f2 = Integer.parseInt(n2.getText().toString());

                int cal = f1 - f2;

                result.setText("Subtraction = " + cal);
            }
        });


        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int f1 = Integer.parseInt(n1.getText().toString());
                int f2 = Integer.parseInt(n2.getText().toString());

                int cal = f1 * f2;

                result.setText("Multiplication = " + cal);
            }
        });


        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int f1 = Integer.parseInt(n1.getText().toString());
                int f2 = Integer.parseInt(n2.getText().toString());

                if (f2 == 0) {
                    result.setText("Cannot divide by zero");
                } else {
                    int cal = f1 / f2;
                    result.setText("Division = " + cal);
                }
            }
        });
    }
}
