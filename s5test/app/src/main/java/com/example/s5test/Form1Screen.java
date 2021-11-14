package com.example.s5test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Form1Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_screen);

        Button  submit_form_button= findViewById(R.id.submit_form_button);

        submit_form_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_matches_screen();
            }
        });
    }

    private void open_matches_screen() {
        Intent open_matches_screen = new Intent(this, MatchesScreen.class);
        startActivity(open_matches_screen);

    }
}
