package com.example.calculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText u1,u2,o;
    Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        u1=findViewById(R.id.in1);
        u2=findViewById(R.id.in2);
        o=findViewById(R.id.out);
        b1=findViewById(R.id.add);
        b2=findViewById(R.id.sub);
        b3=findViewById(R.id.mul);
        b4=findViewById(R.id.div);


        b1.setOnClickListener( v -> {
            int n1=Integer.parseInt(u1.getText().toString());
            int n2=Integer.parseInt(u2.getText().toString());
            int result = n1 + n2;
            o.setText(String.valueOf(result));
        });
        b2.setOnClickListener( v -> {
            int n1=Integer.parseInt(u1.getText().toString());
            int n2=Integer.parseInt(u2.getText().toString());
            int result = n1 - n2;
            o.setText(String.valueOf(result));
        });
        b3.setOnClickListener( v -> {
            int n1=Integer.parseInt(u1.getText().toString());
            int n2=Integer.parseInt(u2.getText().toString());
            int result = n1 * n2;
            o.setText(String.valueOf(result));
        });
        b4.setOnClickListener( v -> {
            int n1=Integer.parseInt(u1.getText().toString());
            int n2=Integer.parseInt(u2.getText().toString());
            int result = n1 / n2;
            o.setText(String.valueOf(result));
        });

    }
}