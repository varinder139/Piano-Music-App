package com.varindermusic.pianomusicalinstrument;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class MainActivity extends AppCompatActivity {
    private AdView mAdView;

    private SoundPool soundPool;
    private int sound_copy_one, sound_one, sound_two, sound_three, sound_four, sound_five, sound_six, sound_seven,
            sound_eight, sound_nine, sound_ten, sound_elevn, sound_twelve, sound_thriteen, sound_fourteen, sound_fifteen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Ads coding is here
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    // Ads code end here


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            soundPool = new SoundPool.Builder().setMaxStreams(5).build();
        }
        else {
            soundPool = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
        }

        sound_copy_one =soundPool.load(this, R.raw.one_copy, 1);
        sound_one = soundPool.load(this, R.raw.one, 1);
        sound_two = soundPool.load(this, R.raw.two, 1);
        sound_three = soundPool.load(this, R.raw.three, 1);
        sound_four = soundPool.load(this, R.raw.four, 1);
        sound_five = soundPool.load(this, R.raw.five, 1);
        sound_six = soundPool.load(this, R.raw.six, 1);
        sound_seven = soundPool.load(this, R.raw.seven, 1);
        sound_eight = soundPool.load(this, R.raw.eight, 1);
        sound_nine = soundPool.load(this, R.raw.nine, 1);
        sound_ten = soundPool.load(this, R.raw.ten, 1);
        sound_elevn = soundPool.load(this, R.raw.eleven, 1);
        sound_twelve = soundPool.load(this, R.raw.twelve, 1);
        sound_fourteen = soundPool.load(this, R.raw.fourteen, 1);
        sound_fifteen = soundPool.load(this, R.raw.fifteen, 1);
    }

    public void click(View view) {

        switch (view.getId()){

            case R.id.buttonOne:
                soundPool.play(sound_copy_one,1,1,0,0,1);
                break;

            case R.id.buttonTwo:
                soundPool.play(sound_one,1,1,0,0,1);
                break;
            case R.id.buttonThree:
                soundPool.play(sound_two,1,1,0,0,1);
                break;
            case R.id.buttonFour:
                soundPool.play(sound_three,1,1,0,0,1);
                break;
            case R.id.buttonFive:
                soundPool.play(sound_four,1,1,0,0,1);

                break;
            case R.id.buttonSix:
                soundPool.play(sound_five,1,1,0,0,1);

                break;
            case R.id.buttonSeven:
                soundPool.play(sound_six,1,1,0,0,1);

                break;
            case R.id.buttonEight:
                soundPool.play(sound_seven,1,1,0,0,1);

                break;
            case R.id.buttonNine:
                soundPool.play(sound_eight,1,1,0,0,1);
                break;
            case R.id.buttonTen:
                soundPool.play(sound_nine,1,1,0,0,1);
                break;
            case R.id.buttonEleven:
                soundPool.play(sound_ten,1,1,0,0,1);
                break;
            case R.id.buttonTwelve:
                soundPool.play(sound_elevn,1,1,0,0,1);
                break;
            case R.id.buttonThirteen:
                soundPool.play(sound_twelve,1,1,0,0,1);
                break;
            case R.id.buttonFourteen:
                soundPool.play(sound_fourteen,1,1,0,0,1);
                break;
            case R.id.buttonFifteen:
                soundPool.play(sound_fifteen,1,1,0,0,1);
                break;
        }
    }
}
