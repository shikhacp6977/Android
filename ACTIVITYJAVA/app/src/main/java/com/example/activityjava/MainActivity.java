package com.example.activityjava;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;

import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("state","oncreate called");
        Toast.makeText(MainActivity.this,"oncreate called",Toast.LENGTH_SHORT).show();
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i("state","onResume");
        Toast.makeText(MainActivity.this,"onResume called",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i("sate","onStop");
        Toast.makeText(MainActivity.this,"onStop called",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i("sate","onPause");
        Toast.makeText(MainActivity.this,"onPause called",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("state","onDestroy");
    }
    @Override
    protected  void onStart(){
        super.onStart();
        Log.i("state","onStart");
    }
}