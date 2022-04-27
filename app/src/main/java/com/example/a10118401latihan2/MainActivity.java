package com.example.a10118401latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView= findViewById(R.id.register);
        textView.setOnClickListener(v -> {
            Intent intent=new Intent(MainActivity.this,RegisterActivity.class);
            startActivity(intent);
        });
    }
}