package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Integer count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickaddMonkeys(View view) {
        count++;
        TextView countView = findViewById(R.id.txt_count);
        countView.setText(count.toString());
    }

    public void offClickaddMonkeys(View view) {
        count = 0;
        TextView countView = findViewById(R.id.txt_count);
        countView.setText(count.toString());
    }
}