package com.cuk.attendancesystem.views.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.splashscreen.SplashScreen;

import android.content.Intent;
import android.os.Bundle;
import com.cuk.attendancesystem.databinding.ActivityIntroBinding;

public class IntroActivity extends AppCompatActivity {
    private ActivityIntroBinding introBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SplashScreen splashScreen = SplashScreen.installSplashScreen(this);
        super.onCreate(savedInstanceState);

        introBinding = ActivityIntroBinding.inflate(getLayoutInflater());

        splashScreen.setKeepOnScreenCondition(() -> true );

        setContentView(introBinding.getRoot());

        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}