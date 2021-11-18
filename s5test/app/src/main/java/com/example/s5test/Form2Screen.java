package com.example.s5test;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class Form2Screen extends AppCompatActivity {

    ArrayList<String> tags = new ArrayList<>();
    boolean allDatesChecked = false;
    boolean allTagsChecked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form2_screen);

        CheckBox mon_checkbox = findViewById(R.id.monday_checkbox);
        CheckBox tues_checkbox = findViewById(R.id.tuesday_checkbox);
        CheckBox wed_checkbox = findViewById(R.id.wednesday_checkbox);
        CheckBox thurs_checkbox = findViewById(R.id.thursday_checkbox);
        CheckBox fri_checkbox = findViewById(R.id.friday_checkbox);
        CheckBox sat_checkbox = findViewById(R.id.saturday_checkbox);
        CheckBox sun_checkbox = findViewById(R.id.sunday_checkbox);

        Button business_b = findViewById(R.id.business_interest);
        Button arts_b = findViewById(R.id.arts_interest);
        Button autos_b = findViewById(R.id.autos_interest);
        Button comp_b = findViewById(R.id.computers_interest);
        Button finance_b = findViewById(R.id.finance_interest);
        Button games_b = findViewById(R.id.video_games_interest);
        Button fitness_b = findViewById(R.id.fitness_interest);
        Button books_b = findViewById(R.id.books_interest);
        Button home_b = findViewById(R.id.home_interest);
        Button human_b = findViewById(R.id.humanitarian_aid_interest);
        Button construct_b = findViewById(R.id.construction_interest);

        Button submit_form_button = findViewById(R.id.submit_form_button);

        TextView days_error_msg = findViewById(R.id.days_available_error);
        TextView interests_error_msg = findViewById(R.id.interests_tags_error);

        ArrayList<CheckBox> checkList = new ArrayList<>(Arrays.asList(mon_checkbox,tues_checkbox,wed_checkbox,thurs_checkbox,fri_checkbox,sat_checkbox,sun_checkbox));
        ArrayList<Button> tagsList = new ArrayList<>(Arrays.asList(business_b,arts_b,autos_b,comp_b,finance_b,games_b,fitness_b,books_b,home_b,human_b,construct_b));

        submit_form_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mon_checkbox.isChecked() && !tues_checkbox.isChecked() && !wed_checkbox.isChecked() && !thurs_checkbox.isChecked() && !fri_checkbox.isChecked() && !sat_checkbox.isChecked() && !sun_checkbox.isChecked()) {
                    for (CheckBox box : checkList) {
                        box.setButtonTintList(ColorStateList.valueOf(getResources().getColor(R.color.error_red)));
                    }
                    days_error_msg.setVisibility(View.VISIBLE);
                    allDatesChecked = false;
                }
                else {
                    allDatesChecked = true;
                }

                if (allTagsFalse(tagsList)) {
                    interests_error_msg.setVisibility(View.VISIBLE);
                    allTagsChecked = false;
                }
                else {
                    interests_error_msg.setVisibility(View.GONE);
                    allTagsChecked = true;
                }

                if (allDatesChecked && allTagsChecked) {
                    days_error_msg.setVisibility(View.GONE);
                    interests_error_msg.setVisibility(View.GONE);
                    open_matches_screen();
                }
            }
        });

        for (CheckBox box : checkList) {
            box.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    for (CheckBox round2 : checkList) {
                        round2.setButtonTintList(ColorStateList.valueOf(getResources().getColor(R.color.teal_700)));
                    }
                    days_error_msg.setVisibility(View.GONE);
                }
            });
        }

        business_b.setOnClickListener(v -> checkActivation(business_b));
        arts_b.setOnClickListener(v -> checkActivation(arts_b));
        autos_b.setOnClickListener(v -> checkActivation(autos_b));
        comp_b.setOnClickListener(v -> checkActivation(comp_b));
        finance_b.setOnClickListener(v -> checkActivation(finance_b));
        games_b.setOnClickListener(v -> checkActivation(games_b));
        fitness_b.setOnClickListener(v -> checkActivation(fitness_b));
        books_b.setOnClickListener(v -> checkActivation(books_b));
        home_b.setOnClickListener(v -> checkActivation(home_b));
        human_b.setOnClickListener(v -> checkActivation(human_b));
        construct_b.setOnClickListener(v -> checkActivation(construct_b));
    }

    private void open_matches_screen() {
        Intent open_matches_screen = new Intent(this, MatchesScreen.class);
        startActivity(open_matches_screen);
    }

    private void checkActivation(Button b) {
        if (b.isActivated()) {
            b.setBackgroundResource(R.drawable.rounded_rectangle3);
            b.setActivated(false);
            tags.remove(Integer.toString(b.getId()));
        }
        else {
            b.setBackgroundResource(R.drawable.rounded_rectangle1);
            b.setActivated(true);
            tags.add(Integer.toString(b.getId()));
        }
    }

    private boolean allTagsFalse(ArrayList<Button> r1) {
        for (Button b : r1) {
            if (b.isActivated()) {
                return false;
            }
        }
        return true;
    }
}
