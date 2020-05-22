package com.example.agrocapture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SplashScreenActivity extends AppCompatActivity {

    private static int SPLASH_TIME = 4500;
    ImageView splash_icon;
    TextView splash_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        splash_icon = findViewById(R.id.splash_icon);
        splash_text = findViewById(R.id.splash_text);

        //Set Icon to be at -X axis and then bring out to the center of the page
        splash_icon.setX(-2000);
        splash_icon.animate().translationXBy(2000).setDuration(3000);

        //Set Text to be fading in gradually
        Animation fade_in = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        splash_text.startAnimation(fade_in);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_TIME);
    }
}
