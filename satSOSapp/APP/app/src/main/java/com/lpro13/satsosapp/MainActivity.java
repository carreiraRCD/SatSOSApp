package com.lpro13.satsosapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TimerTask task = new TimerTask() {
            @Override
            public void run(){
                Intent intent = new Intent( MainActivity.this, PrincipalActivity.class);
                startActivity(intent);
                finish();
            }
        };

        Timer time = new Timer();
        time.schedule(task, 1000);
    }
}