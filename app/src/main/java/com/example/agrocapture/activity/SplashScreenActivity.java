package com.example.agrocapture.activity;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.agrocapture.R;

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
        splash_icon.animate().translationXBy(2000).setDuration(3500);

        //Set Text to fade in gradually
        final float startSize = 2; // Size in pixels
        final float endSize = 42;
        final int animationDuration = 3000; // Animation duration in ms

        ValueAnimator animator = ValueAnimator.ofFloat(startSize, endSize);
        animator.setDuration(animationDuration);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedValue = (float) valueAnimator.getAnimatedValue();
                splash_text.setTextSize(animatedValue);
            }
        });
        animator.start();

        //Background delay
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                runOnce();
            }
        }, SPLASH_TIME);
    }

    public void runOnce() {
        Boolean isFirstRun = getSharedPreferences("PREFERENCE", MODE_PRIVATE)
                .getBoolean("isFirstRun", true);
        if (isFirstRun) {
            //show OnboardingActivity
            startActivity(new Intent(SplashScreenActivity.this, OnboardingActivity.class));
            finish();
        } else {
            //show LoginActivity
            Intent intent = new Intent(SplashScreenActivity.this, LoginActivity.class);
            startActivity(intent);
        }
        getSharedPreferences("PREFERENCE", MODE_PRIVATE).edit()
                .putBoolean("isFirstRun", false).commit();
    }
}
