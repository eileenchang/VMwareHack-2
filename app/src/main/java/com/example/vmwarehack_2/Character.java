package com.example.vmwarehack_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Character extends AppCompatActivity {
    FragmentTransaction fragmentTransaction;
    int charac = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character);

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

        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        character1 car1 = new character1();
        fragmentTransaction.replace(R.id.fragment_container,car1);
        fragmentTransaction.commit();
        Button back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (charac == 1){
                    charac = charac + 2;
                    fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    character3 car3 = new character3();
                    fragmentTransaction.replace(R.id.fragment_container,car3);
                    fragmentTransaction.commit();
                }
                else if (charac == 2){
                    charac = charac - 1;
                    fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    character1 car1 = new character1();
                    fragmentTransaction.replace(R.id.fragment_container,car1);
                    fragmentTransaction.commit();
                }
                else {
                    charac = charac - 1;
                    fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    character2 car2 = new character2();
                    fragmentTransaction.replace(R.id.fragment_container,car2);
                    fragmentTransaction.commit();
                }
            }
        });
        Button ford = findViewById(R.id.ford);
        ford.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (charac == 1){
                    charac = charac + 1;
                    fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    character2 car2 = new character2();
                    fragmentTransaction.replace(R.id.fragment_container,car2);
                    fragmentTransaction.commit();
                }
                else if (charac == 2){
                    charac = charac + 1;
                    fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    character3 car3 = new character3();
                    fragmentTransaction.replace(R.id.fragment_container,car3);
                    fragmentTransaction.commit();
                }
                else {
                    charac = charac - 2;
                    fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    character1 car1 = new character1();
                    fragmentTransaction.replace(R.id.fragment_container,car1);
                    fragmentTransaction.commit();
                }
            }
        });

    }
}