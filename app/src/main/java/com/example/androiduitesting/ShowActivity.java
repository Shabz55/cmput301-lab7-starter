package com.example.androiduitesting;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_activity);

        Button btnBack = findViewById(R.id.btnback);
        TextView cityText = findViewById(R.id.citytext);
        String city = getIntent().getStringExtra("city");
        cityText.setText(city);


        btnBack.setOnClickListener(v -> finish());


    }
}