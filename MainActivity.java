package com.example.myfirstapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    private Integer count = 0;

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null &&
                savedInstanceState.containsKey("count")) {
            count = savedInstanceState.getInt("count");
        }
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        setContentView(R.layout.activity_main);
        savedInstanceState.putInt("count", count);
    }
    @SuppressLint("SetTextI18n")
    public void onClickaddMonkeys(View view) {
        count++;
        TextView countView = findViewById(R.id.txt_count);
        countView.setText(count.toString());
        Toast toast = Toast.makeText(this, "Вы добавили бибизяна",Toast.LENGTH_LONG);
        toast.show();
    }

    @SuppressLint("SetTextI18n")
    public void offClickaddMonkeys(View view) {
        count = 0;
        TextView countView = findViewById(R.id.txt_count);
        countView.setText(count.toString());
        Toast toast = Toast.makeText(this, "вы обнулили бибизянов",Toast.LENGTH_LONG);
        toast.show();
    }
}