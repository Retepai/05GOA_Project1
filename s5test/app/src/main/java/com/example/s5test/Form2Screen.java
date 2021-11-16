package com.example.s5test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Form2Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form2_screen);

        CheckBox monday_checkbox = findViewById(R.id.monday_checkbox);
        Button submit_form_button = findViewById(R.id.submit_form_button);


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
