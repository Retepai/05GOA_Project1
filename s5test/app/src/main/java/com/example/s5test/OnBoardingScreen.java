package com.example.s5test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class OnBoardingScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onboarding_screen);

        Button get_started_button = findViewById(R.id.get_started_button);

        get_started_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_form1_screen();
            }
        });
    }

    private void open_form1_screen() {
        Intent open_form1_screen = new Intent(this, Form1Screen.class);
        startActivity(open_form1_screen);
    }
}
