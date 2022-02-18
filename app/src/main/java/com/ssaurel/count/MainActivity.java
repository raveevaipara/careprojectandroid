package com.ssaurel.count;



import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.app.TaskStackBuilder;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.Toast;

import static com.ssaurel.count.MyIntentService.NOTIFICATION_ID;


public class MainActivity extends AppCompatActivity {

    ImageButton bu;
    public static final int NOTIFICATION_ID = 234;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // ImageButton bu = findViewById(R.id.button);

        //bu.setOnClickListener(new View.OnClickListener() {
          //  @Override
            //public void onClick(View v) {
              //  createNotification();

            //}
        //});



       android.widget.ImageButton liuy = findViewById(R.id.button);
        liuy.setOnClickListener(v -> {

            Intent intent = new Intent(this, Button.class);
            startActivity(intent);
            createNotification();

        });

        //String message =  getIntent().getStringExtra("message");


    }

    public void createNotification(){
        String massage = "This is notification";
        NotificationCompat.Builder builder = new NotificationCompat.Builder(
                MainActivity.this
        )
                .setSmallIcon(R.drawable.ic_ac)
                .setContentTitle("CareCalCrean")
                .setContentText(massage)
                .setAutoCancel(true);

        Intent intent = new Intent(MainActivity.this,
                MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.putExtra("message", massage);

        PendingIntent pendingIntent = PendingIntent.getActivity(MainActivity.this,
                0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(pendingIntent);

        NotificationManager notificationManager= (NotificationManager)getSystemService(
                Context.NOTIFICATION_SERVICE
        );
        notificationManager.notify(0,builder.build());


    }
}








