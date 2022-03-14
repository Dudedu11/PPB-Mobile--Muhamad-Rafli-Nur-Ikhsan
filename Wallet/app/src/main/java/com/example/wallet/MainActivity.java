package com.example.wallet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Start(View view) {
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent);
    }

    public void Start3(View view) {
        Intent intent = new Intent(MainActivity.this,MainActivity3.class);
        startActivity(intent);
    }

    public void Start4(View view) {
        Intent intent = new Intent(MainActivity.this,MainActivity4.class);
        startActivity(intent);
    }

    public void Start5(View view) {
        Intent intent = new Intent(MainActivity.this,MainActivity5.class);
        startActivity(intent);
    }

    public void Start6(View view) {
        Intent intent = new Intent(MainActivity.this,MainActivity6.class);
        startActivity(intent);
    }

    public void Start7(View view) {
        Intent intent = new Intent(MainActivity.this,MainActivity7.class);
        startActivity(intent);
    }
}