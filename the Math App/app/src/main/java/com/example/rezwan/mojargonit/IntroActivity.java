package com.example.rezwan.mojargonit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;



public class IntroActivity extends AppCompatActivity {
    private static final long SPLASH_TIME = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        //startActivity(new Intent(LoginActivity.this,MainActivity.class));

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
//                Intent mainIntent=new Intent().setClass(intro.this,main.class);
                startActivity(new Intent(IntroActivity.this, LoginActivity.class));
                //startActivity(mainIntent);
                finish();
            }
        };
        Timer timer = new Timer();
        timer.schedule(task, SPLASH_TIME);
    }
}
