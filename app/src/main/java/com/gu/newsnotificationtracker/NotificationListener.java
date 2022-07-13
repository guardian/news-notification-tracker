package com.gu.newsnotificationtracker;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.util.Log;


public class NotificationListener extends NotificationListenerService {

    private static final String TAG = "NotificationListener";

    @Override
    public IBinder onBind(Intent intent) {
        Log.i(TAG, "I have bound");
        return super.onBind(intent);
    }

    @Override
    public void onNotificationPosted(StatusBarNotification sbn){
        // Implement what you want here
        Log.i(TAG, "A notification happened!");
    }

}
