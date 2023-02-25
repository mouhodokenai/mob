package com.example.myapplication1;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    public static final String TAG = "StartActivity";

    private Integer count = 5;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate");
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate()", Toast.LENGTH_LONG).show();
        Log.d(TAG, "onCreate");
    }


    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null &&
                savedInstanceState.containsKey("count")) {
            count = savedInstanceState.getInt("count");
        }
        Log.d(TAG, "onRestoreInstanceState");
        Toast.makeText(this, "onRestoreInstanceState", Toast.LENGTH_LONG).show();
    }


    @Override
    public void onRestart(){
        super.onRestart();
        Log.d(TAG, "onRestart");
        Toast.makeText(this, "onRestart()", Toast.LENGTH_LONG).show();
    }


    @Override
    public void onStart(){
        super.onStart();
        Log.d(TAG, "onStart");
        resetUI();
        Toast.makeText(this, "onStart()", Toast.LENGTH_LONG).show();
    }


    @Override
    public void onResume(){
        super.onResume();
        Log.d(TAG, "onResume");
        Toast.makeText(this, "onResume()", Toast.LENGTH_LONG).show();
    }


    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        Log.d(TAG, "onSaveInstanceState");
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("count", count);
        Toast.makeText(this, "onSaveInstanceState", Toast.LENGTH_LONG).show();
    }


    @Override
    public void onPause(){
        Log.d(TAG, "onPause");
        super.onPause();
        Toast.makeText(this, "onPause()", Toast.LENGTH_LONG).show();
    }


    @Override
    public void onStop(){
        Log.d(TAG, "onStop");
        super.onStop();
        Toast.makeText(this, "onStop()", Toast.LENGTH_LONG).show();
    }


    @Override
    public void onDestroy(){
        Log.d(TAG, "onDestroy");
        super.onDestroy();
        Toast.makeText(this, "onDestroy()", Toast.LENGTH_LONG).show();
    }

    private void resetUI() {
        ((TextView) findViewById(R.id.txt_counter)).setText(count.toString());
        Log.d(TAG, "resetUI");
    }
}
