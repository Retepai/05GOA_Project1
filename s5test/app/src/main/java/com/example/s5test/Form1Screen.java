package com.example.s5test;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class Form1Screen extends AppCompatActivity {

    ArrayList<String> certifications  = new ArrayList<>();
    ArrayList<String> languages = new ArrayList<>();

    boolean ageCriteriaFilled = false;
    boolean cityCriteriaFilled = false;
    boolean radioCriteriaFilled = false;
    boolean languagesCriteriaFilled = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form1_screen);

        ColorStateList colorStateListEnabled = new ColorStateList(
                new int[][]
                        {
                                new int[]{android.R.attr.state_enabled}   // Enabled
                        },
                new int[]
                        {
                                Color.RED,   // enabled
                        }
        );

        ColorStateList colorStateListDisabled = new ColorStateList(
                new int[][]
                        {
                                new int[]{android.R.attr.state_enabled}   // Disabled
                        },
                new int[]
                        {
                                Color.BLACK,   // disabled
                        }
        );

        ImageView age_edit_text_box = findViewById(R.id.age_edit_text_box);
        EditText age_edit_text = findViewById(R.id.age_edit_text);
        TextView age_valid_number_error = findViewById(R.id.age_valid_number_error);
        ImageView city_edit_text_box = findViewById(R.id.city_edit_text_box);
        EditText city_edit_text = findViewById(R.id.city_edit_text);
        TextView city_valid_word_error = findViewById(R.id.city_valid_word_error);
        RadioGroup drivers_licence_radio_group = findViewById(R.id.drivers_licence_radio_group);
        RadioButton drivers_licence_radio_yes = findViewById(R.id.drivers_licence_radio_yes);
        RadioButton drivers_licence_radio_no = findViewById(R.id.drivers_licence_radio_no);
        TextView drivers_license_radio_error = findViewById(R.id.drivers_licence_radio_error);
        Button get_wet_certification = findViewById(R.id.get_wet_certification);
        Button first_aid_certification = findViewById(R.id.first_aid_certification);
        Button food_safe_certification = findViewById(R.id.food_safe_certification);
        Button forklift_operator_certification = findViewById(R.id.forklift_operator_certification);
        Button babysitting_certification = findViewById(R.id.babysitting_certification);
        TextView language_tag_error = findViewById(R.id.language_tag_error);
        Button english_language = findViewById(R.id.english_language);
        Button japanese_language = findViewById(R.id.japanese_language);
        Button french_language = findViewById(R.id.french_language);
        Button russian_language = findViewById(R.id.russian_language);
        Button portuguese_language = findViewById(R.id.portuguese_language);
        Button hindi_language = findViewById(R.id.hindi_language);
        Button korean_language = findViewById(R.id.korean_language);
        Button german_language = findViewById(R.id.german_language);
        Button spanish_language = findViewById(R.id.spanish_language);
        Button chinese_language = findViewById(R.id.chinese_language);

        ArrayList<Button> languageButtons = new ArrayList<>(Arrays.asList(english_language, japanese_language, french_language, russian_language, portuguese_language, hindi_language, korean_language, german_language, spanish_language, chinese_language));

//        if any error checks still remain true, this button will change to being greyed out
        Button next_form_button = findViewById(R.id.next_form_button);

        age_edit_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        next_form_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                how to make it so this also checks if what the user typed is real numbers?
                String userAge = age_edit_text.getText().toString().trim();
                if (userAge.isEmpty() || userAge.matches("[a-zA-Z]+\\.?")){
                    age_edit_text_box.setImageResource(R.drawable.rounded_rectangle5);
                    age_edit_text.setTextColor(getResources().getColor(R.color.error_red));
                    age_valid_number_error.setVisibility(View.VISIBLE);
                    ageCriteriaFilled = false;
                }
                else {
                    age_edit_text_box.setImageResource(R.drawable.rounded_rectangle2);
                    age_edit_text.setTextColor(getResources().getColor(R.color.black));
                    age_edit_text.setHintTextColor(getResources().getColor(R.color.normal_grey));
                    age_valid_number_error.setVisibility(View.GONE);
                    ageCriteriaFilled = true;
                }

                String userCity = city_edit_text.getText().toString();
                if (userCity.trim().isEmpty() || userCity.matches(".*\\d.*")) {
                    city_edit_text_box.setImageResource(R.drawable.rounded_rectangle5);
                    city_edit_text.setTextColor(getResources().getColor(R.color.error_red));
                    city_valid_word_error.setVisibility(View.VISIBLE);
                    cityCriteriaFilled = false;
                }
                else {
                    city_edit_text_box.setImageResource(R.drawable.rounded_rectangle2);
                    city_edit_text.setTextColor(getResources().getColor(R.color.black));
                    city_edit_text.setHintTextColor(getResources().getColor(R.color.normal_grey));
                    city_valid_word_error.setVisibility(View.GONE);
                    cityCriteriaFilled = true;
                }
                if (drivers_licence_radio_group.getCheckedRadioButtonId() == -1) {
                    drivers_licence_radio_yes.setButtonTintList(colorStateListEnabled);
                    drivers_licence_radio_no.setButtonTintList(colorStateListEnabled);
                    drivers_license_radio_error.setVisibility(View.VISIBLE);
                    radioCriteriaFilled = false;
                }
                else {
                    drivers_licence_radio_yes.setButtonTintList(colorStateListDisabled);
                    drivers_licence_radio_no.setButtonTintList(colorStateListDisabled);
                    drivers_license_radio_error.setVisibility(View.GONE);
                    radioCriteriaFilled = true;
                }
                if (allLanguagesFalse(languageButtons)) {
                    language_tag_error.setVisibility(View.VISIBLE);
                    languagesCriteriaFilled = false;
                }
                else {
                    language_tag_error.setVisibility(View.GONE);
                    languagesCriteriaFilled = true;
                }

                if (ageCriteriaFilled && cityCriteriaFilled && radioCriteriaFilled && languagesCriteriaFilled) {
                    city_edit_text.getText().clear();
                    age_edit_text.getText().clear();
                    drivers_licence_radio_group.clearCheck();
                    open_form2_screen();
                }

            }
        });




        get_wet_certification.setOnClickListener(v -> checkActivation(get_wet_certification,0));
        first_aid_certification.setOnClickListener(v -> checkActivation(first_aid_certification,0));
        food_safe_certification.setOnClickListener(v -> checkActivation(food_safe_certification,0));
        forklift_operator_certification.setOnClickListener(v -> checkActivation(forklift_operator_certification,0));
        babysitting_certification.setOnClickListener(v -> checkActivation(forklift_operator_certification,0));

        english_language.setOnClickListener(v -> checkActivation(english_language,1));
        japanese_language.setOnClickListener(v -> checkActivation(japanese_language,1));
        french_language.setOnClickListener(v -> checkActivation(french_language,1));
        russian_language.setOnClickListener(v -> checkActivation(russian_language,1));
        portuguese_language.setOnClickListener(v -> checkActivation(portuguese_language,1));
        hindi_language.setOnClickListener(v -> checkActivation(hindi_language,1));
        korean_language.setOnClickListener(v -> checkActivation(korean_language,1));
        german_language.setOnClickListener(v -> checkActivation(german_language,1));
        spanish_language.setOnClickListener(v -> checkActivation(spanish_language,1));
        chinese_language.setOnClickListener(v -> checkActivation(chinese_language,1));
    }

    private void open_form2_screen() {
        Intent open_form2_screen = new Intent(this, Form2Screen.class);
        startActivity(open_form2_screen);
    }

    private void checkActivation(Button b, int type) {
        // type: 0 = cert, 1 = lang
        if (b.isActivated()) {
//            System.out.println(b.getId() + " activated -> deactivated");
            b.setBackgroundResource(R.drawable.rounded_rectangle3);
            b.setActivated(false);
            if (type == 0) {
                certifications.remove(Integer.toString(b.getId()));
            }
            else {
                languages.remove(Integer.toString(b.getId()));
            }
        }
        else {
//            System.out.println(b.getId() + " deactivated -> activated");
            b.setBackgroundResource(R.drawable.rounded_rectangle1);
            b.setActivated(true);
            if (type == 0) {
                certifications.add(Integer.toString(b.getId()));
            }
            else {
                languages.add(Integer.toString(b.getId()));
            }
        }
    }

    private boolean allLanguagesFalse(ArrayList<Button> r1) {
        for (Button b: r1) {
            if (b.isActivated()) {
                return false;
            }
        }
        return true;
    }
}
