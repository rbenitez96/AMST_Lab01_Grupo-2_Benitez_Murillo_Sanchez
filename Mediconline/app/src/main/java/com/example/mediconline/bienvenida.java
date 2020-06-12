package com.example.mediconline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class bienvenida extends AppCompatActivity {

    Handler handler;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);

        img = findViewById(R.id.logo_bienvenida);
        img.animate().alpha(3000).setDuration(0);

        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent log = new Intent(bienvenida.this, MainActivity.class);
                startActivity(log);
                finish();
            }
        },3000);
    }
}
