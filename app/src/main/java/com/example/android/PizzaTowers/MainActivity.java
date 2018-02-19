package com.example.android.PizzaTowers;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GifImageView gifImageView =findViewById(R.id.GifImageView);
        gifImageView.setGifImageResource(R.drawable.pizza);
    }
}
