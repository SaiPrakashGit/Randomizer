package com.example.randomizer;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        TextView resultText = (TextView) findViewById(R.id.resultText);
        SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar);
        seekBar.setMin(1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int random = new Random().nextInt(seekBar.getProgress());
                final TextView resultText = findViewById(R.id.resultText);
                resultText.setText(String.valueOf(random + 1));
            }
        });
}}