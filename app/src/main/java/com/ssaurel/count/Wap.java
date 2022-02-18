package com.ssaurel.count;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Wap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wap);

        ImageButton Kawan = findViewById(R.id.igBig);
        Kawan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("http://instagram.com/kwan_phuwamet");
                Intent instargram = new Intent(Intent.ACTION_VIEW, uri);
                instargram.setPackage("com.instagram.android");
                try {
                    startActivity(instargram);
                }catch (ActivityNotFoundException e){
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/")));
                }

            }
        });


        ImageButton Kri = findViewById(R.id.igNon);
        Kri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("http://www.instagram.com/kryslay");
                Intent instargram = new Intent(Intent.ACTION_VIEW, uri);
                instargram.setPackage("com.instagram.android");
                try {
                    startActivity(instargram);
                }catch (ActivityNotFoundException e){
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/")));
                }

            }
        });

        ImageButton Earn = findViewById(R.id.igEarn);
        Earn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("http://www.instagram.com/earlmarshal");
                Intent instargram = new Intent(Intent.ACTION_VIEW, uri);
                instargram.setPackage("com.instagram.android");
                try {
                    startActivity(instargram);
                }catch (ActivityNotFoundException e){
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/")));
                }

            }
        });


        ImageButton Ten = findViewById(R.id.igTen);
        Ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("http://www.instagram.com/tenwatsawat");
                Intent instargram = new Intent(Intent.ACTION_VIEW, uri);
                instargram.setPackage("com.instagram.android");
                try {
                    startActivity(instargram);
                }catch (ActivityNotFoundException e){
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/")));
                }

            }
        });

        ImageButton Nai = findViewById(R.id.igN);
        Nai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("http://www.instagram.com/nilspaniard");
                Intent instargram = new Intent(Intent.ACTION_VIEW, uri);
                instargram.setPackage("com.instagram.android");
                try {
                    startActivity(instargram);
                }catch (ActivityNotFoundException e){
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/")));
                }

            }
        });


        ImageButton Non = findViewById(R.id.igNong);
        Non.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("http://www.instagram.com/nongearn14");
                Intent instargram = new Intent(Intent.ACTION_VIEW, uri);
                instargram.setPackage("com.instagram.android");
                try {
                    startActivity(instargram);
                }catch (ActivityNotFoundException e){
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/")));
                }

            }
        });

        ImageButton Big = findViewById(R.id.igBig);
        Big.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("http://www.instagram.com/here_big");
                Intent instargram = new Intent(Intent.ACTION_VIEW, uri);
                instargram.setPackage("com.instagram.android");
                try {
                    startActivity(instargram);
                }catch (ActivityNotFoundException e){
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/")));
                }

            }
        });


        ImageButton Jim = findViewById(R.id.igJim);
        Jim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("http://www.instagram.com/jimxgym");
                Intent instargram = new Intent(Intent.ACTION_VIEW, uri);
                instargram.setPackage("com.instagram.android");
                try {
                    startActivity(instargram);
                }catch (ActivityNotFoundException e){
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/")));
                }

            }
        });

        ImageButton Jj = findViewById(R.id.igJj);
        Jj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("http://www.instagram.com/fitwithjayz");
                Intent instargram = new Intent(Intent.ACTION_VIEW, uri);
                instargram.setPackage("com.instagram.android");
                try {
                    startActivity(instargram);
                }catch (ActivityNotFoundException e){
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/")));
                }

            }
        });

        ImageButton Jun = findViewById(R.id.igJun);
        Jun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("http://www.instagram.com/forcejun");
                Intent instargram = new Intent(Intent.ACTION_VIEW, uri);
                instargram.setPackage("com.instagram.android");
                try {
                    startActivity(instargram);
                }catch (ActivityNotFoundException e){
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/")));
                }

            }
        });

        ImageButton Jib = findViewById(R.id.igJib);
        Jib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("http://www.instagram.com/jybppd");
                Intent instargram = new Intent(Intent.ACTION_VIEW, uri);
                instargram.setPackage("com.instagram.android");
                try {
                    startActivity(instargram);
                }catch (ActivityNotFoundException e){
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/")));
                }

            }
        });

        ImageButton Land = findViewById(R.id.igLand);
        Land.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("http://www.instagram.com/land_sarunrit");
                Intent instargram = new Intent(Intent.ACTION_VIEW, uri);
                instargram.setPackage("com.instagram.android");
                try {
                    startActivity(instargram);
                }catch (ActivityNotFoundException e){
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/")));
                }

            }
        });

        ImageButton Fah = findViewById(R.id.igema);
        Fah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("http://www.instagram.com/fassai");
                Intent instargram = new Intent(Intent.ACTION_VIEW, uri);
                instargram.setPackage("com.instagram.android");
                try {
                    startActivity(instargram);
                }catch (ActivityNotFoundException e){
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/")));
                }

            }
        });

        ImageButton Greg = findViewById(R.id.igGreg);
        Greg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("http://www.instagram.com/gregmotti");
                Intent instargram = new Intent(Intent.ACTION_VIEW, uri);
                instargram.setPackage("com.instagram.android");
                try {
                    startActivity(instargram);
                }catch (ActivityNotFoundException e){
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/")));
                }

            }
        });

        ImageButton ema = findViewById(R.id.igemanu);
        ema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("http://www.instagram.com/emanuel_calmo");
                Intent instargram = new Intent(Intent.ACTION_VIEW, uri);
                instargram.setPackage("com.instagram.android");
                try {
                    startActivity(instargram);
                }catch (ActivityNotFoundException e){
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/")));
                }

            }
        });

        ImageButton adam = findViewById(R.id.igadam);
        adam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("http://www.instagram.com/adamzimafit");
                Intent instargram = new Intent(Intent.ACTION_VIEW, uri);
                instargram.setPackage("com.instagram.android");
                try {
                    startActivity(instargram);
                }catch (ActivityNotFoundException e){
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/")));
                }

            }
        });






    }
}