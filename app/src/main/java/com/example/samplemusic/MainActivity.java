package com.example.samplemusic;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp = MediaPlayer.create(MainActivity.this, R.raw.music);
        mp.start();

    }

    @Override // 구현한다
    protected void onResume() {
        super.onResume();
        if(!mp.isPlaying())
        {
            mp.start();
        }

    }

    @Override
    protected void onPause() {
        super.onPause();
        mp.pause();
    }
}
