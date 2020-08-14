package com.example.zmc_activity_exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Second_Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_2);
        TextView contactsWay = findViewById(R.id.contacts_way);
        String contactsInformation = "";
        String contactsName = (getIntent().getStringExtra("name")==null)?"":getIntent().getStringExtra("name");
        String contactsPhone = (getIntent().getStringExtra("phone")==null)?"":getIntent().getStringExtra("phone");
        contactsInformation = contactsName +contactsPhone;
        if(!contactsInformation.equals("")){
            contactsWay.setText(contactsInformation);
        }
        Log.e("Second activity","SA,onCreate");


        TextView chooseContacts = findViewById(R.id.choose_contacts);
        chooseContacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("jump.contacts");
                startActivity(intent);
                finish();
            }
        });

        TextView lifeRound = findViewById(R.id.life_round);
        lifeRound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Second_Activity2.this,LifeRound.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Second activity","SA,onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Second activity","SA,onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Second activity","SA,onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Second activity","SA,onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("Second activity","SA,onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Second activity","SA,onDestroy");
    }
}