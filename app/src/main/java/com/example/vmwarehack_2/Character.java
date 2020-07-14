package com.example.vmwarehack_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Character extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character);

        Button char1 = (Button) findViewById(R.id.chartochar);
        char1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Character.this, Character.class));
            }
        });
        Button char2 = (Button) findViewById(R.id.chartohome);
        char2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Character.this, MainActivity.class));
            }
        });
        Button char3 = (Button) findViewById(R.id.chartocomm);
        char3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Character.this, Community.class));
            }
        });
    }
}