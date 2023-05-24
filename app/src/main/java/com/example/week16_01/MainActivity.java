package com.example.week16_01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.TaskStackBuilder;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void notifyme (View v) {
     /*  NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        Intent myInt = new Intent(MainActivity.this,NotificationReceiver.class);

        PendingIntent pint = PendingIntent.getActivity(MainActivity.this, 0, myInt, PendingIntent.FLAG_IMMUTABLE);


        NotificationCompat.Builder builder=  new NotificationCompat.Builder(this);
        builder.setSmallIcon(android.R.drawable.btn_star_big_on);
        builder.setContentTitle("Notification Alert, Click Me!");
        builder.setContentText("Hi, This is Android Notification Detail!");


        Intent resultIntent = new Intent(this, NotificationReceiver.class);
        TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
        stackBuilder.addParentStack(NotificationReceiver.class);

// Adds the Intent that starts the Activity to the top of the stack
        stackBuilder.addNextIntent(resultIntent);
        PendingIntent resultPendingIntent = stackBuilder.getPendingIntent(0, PendingIntent.FLAG_IMMUTABLE);
        builder.setContentIntent(resultPendingIntent);

        NotificationManager mNotificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

// notificationID allows you to update the notification later on.
        mNotificationManager.notify(1461, builder.build());

        Toast.makeText(this, "HEllo",Toast.LENGTH_LONG).show();*/

        MyNotUtil.showNotification(this,"TrabzonSpor","Bize Her yer Trabzon ");
    }
}
