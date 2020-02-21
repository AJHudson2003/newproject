package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class highscoreactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highscoreactivity);
    }
    public void gotomain (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
