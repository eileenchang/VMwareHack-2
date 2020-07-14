package com.example.vmwarehack_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Community extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community);

        Button home = (Button) findViewById(R.id.home_button);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Community.this, MainActivity.class));
            }
        });

        Button character = (Button) findViewById(R.id.character_button);
        character.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Community.this, Character.class));
            }
        });

        Button chatroom1 = (Button) findViewById(R.id.randomparty_button);
        chatroom1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Community.this, chatroom.class));
            }
        });

        Button chatroom2 = (Button) findViewById(R.id.customparty_button);
        chatroom2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Community.this, chatroom.class));
            }
        });
    }
}