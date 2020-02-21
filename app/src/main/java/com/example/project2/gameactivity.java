package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.annotation.SuppressLint;

public class gameactivity extends AppCompatActivity {

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_gameactivity);
    }
    public void gotomain (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void gotohighscore  (View view){
        Intent intent = new Intent(this, highscoreactivity.class);
        startActivity(intent);
    }
}

