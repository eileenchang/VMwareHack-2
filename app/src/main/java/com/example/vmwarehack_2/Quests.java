package com.example.vmwarehack_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.*;

public class Quests extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quests);

        Button home1 = (Button) findViewById(R.id.button2);
        home1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Quests.this, MainActivity.class));
            }
        });


        TextView textView2 = (TextView) findViewById(R.id.textView2);


        List<String> questboard = new ArrayList<String>();

        questboard.add("Cook a special meal for someone close to you!");
        questboard.add("Touch your toes (with your hands)!");
        questboard.add("Learn how to say hello in a new language!");
        questboard.add("Make a bucket list!");
        questboard.add("Walk, jog, or run a mile!");
        questboard.add("Look up an interesting historical fact!");


        String yourquest = "";

        for (int i = 0; i < questboard.size(); i++) {
            int randomInt = (int)(Math.random()*questboard.size());
            yourquest = questboard.get(randomInt);
        }

        ((TextView) textView2).setText(yourquest);


    }
}