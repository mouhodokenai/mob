package com.example.myfirstapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    public static final String TAG = "StartActivity";
    private Integer count = 0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast toast = Toast.makeText(this, "Привет",Toast.LENGTH_SHORT);
        toast.show();
        Log.d(TAG, "onCreate");
    }
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onRestoreInstanceState", Toast.LENGTH_SHORT).show();
        if (savedInstanceState != null &&
                savedInstanceState.containsKey("count")) {
            count = savedInstanceState.getInt("count");
        }
        Log.d(TAG, "onRestoreInstanceState");
        resetUI();
    }
    @Override
    public void onRestart(){
        super.onRestart();
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onRestart()", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onRestart");
        resetUI();
    }
    @Override
    public void onStart(){
        super.onStart();
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onStart()", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onStart");
        resetUI();
    }

    @SuppressLint("SetTextI18n")
    private void resetUI() {
        ((TextView) findViewById(R.id.txt_count)).setText(count.toString());
        Log.d(TAG, "resetUI");
    }

    @Override
    public void onResume() {
        super.onResume();
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onResume()", Toast.LENGTH_LONG).show();
        Log.d(TAG, "onResume");
        resetUI();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onSaveInstanceState", Toast.LENGTH_SHORT).show();
        savedInstanceState.putInt("count", count);
        Log.d(TAG, "onSaveInstanceState");
        resetUI();
    }
    @Override
    public void onPause(){
        super.onPause();
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onPause()", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onPause");
        resetUI();
    }
    @Override
    public void onStop(){
        super.onStop();
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onStop()", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onStop");
        resetUI();
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onDestroy()", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onDestroy");
        resetUI();
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