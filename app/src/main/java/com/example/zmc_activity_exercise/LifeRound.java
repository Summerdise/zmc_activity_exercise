package com.example.zmc_activity_exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class LifeRound extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liferound);

        Log.e("Life Round","LR,onCreate");

        TextView open = findViewById(R.id.textViewOpen);
        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LifeRound.this,Second_Activity2.class);
                startActivity(intent);
            }
        });

        TextView close = findViewById(R.id.textViewClose);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
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