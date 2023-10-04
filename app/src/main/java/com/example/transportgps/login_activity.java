package com.example.transportgps;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class login_activity extends AppCompatActivity {

    private TextView onclick;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        onclick= (TextView) findViewById(R.id.registrase);
        onclick.setOnClickListener(new View.OnClickListener(){
            public  void  onClick(View v){
                registro_activity();
            }

        });
    }
    public void registro_activity(){
        Intent intent = new Intent (this,registro_activity.class);
        startActivity(intent);
    }
}