package com.example.myapplication;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"Oncreate",Toast.LENGTH_SHORT).show();
        }
        protected void onStart(){
        super.onStart();
            Toast.makeText(this,"Onstart",Toast.LENGTH_SHORT).show();

        }
        protected void onResume(){
        super.onResume();
            Toast.makeText(this,"OnResume",Toast.LENGTH_SHORT).show();

        }
        protected void onPause(){
        super.onPause();
            Toast.makeText(this,"onPause",Toast.LENGTH_SHORT).show();
        }
        protected void onStop(){
        super.onStop();
            Toast.makeText(this,"onStop",Toast.LENGTH_SHORT).show();
        }
        protected void onDestroy(){
        super.onDestroy();
            Toast.makeText(this,"onDestroy",Toast.LENGTH_SHORT).show();
        }

        }

