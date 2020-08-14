package com.example.zmc_activity_exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class LifeRound extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liferound);

        Log.e("Life Round","LR,onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Life Round","LR,onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Life Round","LR,onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Life Round","LR,onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Life Round","LR,onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("Life Round","LR,onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Life Round","LR,onDestroy");
    }
}