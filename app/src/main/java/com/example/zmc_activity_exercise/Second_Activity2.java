package com.example.zmc_activity_exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

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



        TextView chooseContacts = findViewById(R.id.choose_contacts);
        chooseContacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("jump.contacts");
                startActivity(intent);
                finish();
            }
        });
    }
}