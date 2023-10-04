package com.example.transportgps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimerTask tiempoIni = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, login_activity.class);
                startActivity(intent);
                finish();

            }
        }
                ;
        Timer tiempo = new Timer();
        tiempo.schedule(tiempoIni,4000);
    }
}