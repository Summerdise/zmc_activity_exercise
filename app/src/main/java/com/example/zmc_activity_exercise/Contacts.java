package com.example.zmc_activity_exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Contacts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        ImageView getContacts = findViewById(R.id.contacts_image);
        TextView nameText = findViewById(R.id.contacts_name);
        final String name = nameText.getText().toString();
        TextView phoneText = findViewById(R.id.contacts_phone);
        final String phone = phoneText.getText().toString();
        getContacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Contacts.this,Second_Activity2.class);
                intent.putExtra("name",name);
                intent.putExtra("phone",phone);
                startActivity(intent);
                finish();
            }
        });
    }
}