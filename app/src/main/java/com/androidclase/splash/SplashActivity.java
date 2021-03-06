package com.androidclase.splash;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();

        View titleView = findViewById(R.id.title_view);
        View presentsView = findViewById(R.id.presents_view);
        View logoView = findViewById(R.id.logo_view);
        View gamesView = findViewById(R.id.games_view);
        View versionView = findViewById(R.id.version_view);

        Animation fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in_text);
        Animation fadeIn2 = AnimationUtils.loadAnimation(this, R.anim.fade_in_2);
        Animation logoAnim = AnimationUtils.loadAnimation(this, R.anim.logo_animation);

        titleView.startAnimation(fadeIn);
        gamesView.startAnimation(fadeIn2);
        versionView.startAnimation(fadeIn);
        presentsView.startAnimation(fadeIn);
        logoView.startAnimation(logoAnim);

        fadeIn.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Intent menu = new Intent(SplashActivity.this, Menu.class);
                startActivity(menu);
                overridePendingTransition(0, R.anim.fade_out);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });




    }
}