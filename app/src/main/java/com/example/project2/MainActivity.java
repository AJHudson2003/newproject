package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotogame (View view){
        Intent intent = new Intent(this, gameactivity.class);
        startActivity(intent);
    }
    public void gotoscore(View view){
        Intent intent = new Intent(this, highscoreactivity.class);
        startActivity(intent);
    }
}
