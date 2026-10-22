package com.example.facebook;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText u1,p1;
    Button b1;
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
        u1=findViewById(R.id.u);
        p1=findViewById(R.id.p);
        b1=findViewById(R.id.b);
        b1.setOnClickListener(v -> {
            String us= u1.getText().toString().trim();
            String pa = p1.getText().toString().trim();

            if (us.equals("admin@gmail.com") && pa.equals("1234")){
                Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(MainActivity.this, "invalid username or password", Toast.LENGTH_SHORT).show();
            }
        });
    }
}