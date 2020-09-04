package com.example.alarmmanagement;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class RingtonePlayingService extends Service {

    MediaPlayer media_song;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i("LocalService", "Received start id" + startId + ":" + intent);
        media_song = MediaPlayer.create(this, R.raw.alarmclock);
        media_song.start();
        return START_NOT_STICKY;
    }


    @Override
    public void onDestroy() {
        Toast.makeText(this, "on Destroy called", Toast.LENGTH_SHORT).show();
    }
}





