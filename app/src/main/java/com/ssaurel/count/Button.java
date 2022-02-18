package com.ssaurel.count;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Button extends AppCompatActivity  {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        android.widget.ImageButton  MAPBTN = findViewById(R.id.MapBtn);
        MAPBTN.setOnClickListener(v->{

            Intent intent = new Intent(this, MapIo.class);
            startActivity(intent);

        });

        android.widget.ImageButton  man = findViewById(R.id.Wapman);
        man.setOnClickListener(v->{

            Intent intent = new Intent(this, Wap.class);
            startActivity(intent);

        });





        android.widget.ImageButton  La = findViewById(R.id.imageButton);
        La.setOnClickListener(v->{

            Intent intent = new Intent(this, BMI.class);
            startActivity(intent);

        });
        android.widget.ImageButton  ma = findViewById(R.id.imageButton2);
        ma.setOnClickListener(v -> {

            Intent intent = new Intent(this, com.ssaurel.count.home.class);
            startActivity(intent);
        });

        android.widget.ImageButton  btnapi = findViewById(R.id.Btnapi);
        btnapi.setOnClickListener(v->{

            Intent intent = new Intent(this, API.class);
            startActivity(intent);

        });
        android.widget.ImageButton  yu = findViewById(R.id.yo);
        yu.setOnClickListener(v->{

            Intent intent = new Intent(this, youtube.class);
            startActivity(intent);

        });

        android.widget.ImageButton  photo = findViewById(R.id.Gocame);
        photo.setOnClickListener(v->{

            Intent intent = new Intent(this, Camera.class);
            startActivity(intent);

        });

    }
}