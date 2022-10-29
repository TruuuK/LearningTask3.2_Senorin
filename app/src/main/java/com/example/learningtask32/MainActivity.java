package com.example.learningtask32;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MediaPlayer appIntro;
        appIntro = MediaPlayer.create(MainActivity.this,R.raw.motor);
        appIntro.start();

        getSupportActionBar().hide();

        final Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), Homepage.class);
                MainActivity.this.startActivity(intent);
                appIntro.stop();
                MainActivity.this.finish();
            }
        }, 5000);

    }
}