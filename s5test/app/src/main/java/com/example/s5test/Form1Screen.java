package com.example.s5test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Form1Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form1_screen);

        ImageView age_edit_text_box = findViewById(R.id.age_edit_text_box);
        EditText age_edit_text = findViewById(R.id.age_edit_text);
        TextView age_valid_number_error = findViewById(R.id.age_valid_number_error);
        ImageView city_edit_text_box = findViewById(R.id.city_edit_text_box);
        EditText city_edit_text = findViewById(R.id.city_edit_text);
        TextView city_valid_word_error = findViewById(R.id.city_valid_word_error);
        RadioGroup drivers_licence_radio_group = findViewById(R.id.drivers_licence_radio_group);
        RadioButton drivers_licence_radio_yes = findViewById(R.id.drivers_licence_radio_yes);
        RadioButton drivers_licence_radio_no = findViewById(R.id.drivers_licence_radio_no);
        Button get_wet_certification = findViewById(R.id.get_wet_certification);
        Button first_aid_certification = findViewById(R.id.first_aid_certification);
        Button food_safe_certification = findViewById(R.id.food_safe_certification);
        Button forklift_operator_certification = findViewById(R.id.forklift_operator_certification);
        Button babysitting_certification = findViewById(R.id.babysitting_certification);
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
                String userage= age_edit_text.getText().toString().trim();
                if ((age_edit_text.getText().toString().trim().isEmpty())||userage.matches("[a-zA-Z]+\\.?")){
                    age_edit_text_box.setImageResource(R.drawable.rounded_rectangle5);
                    age_edit_text.setTextColor(getResources().getColor(R.color.error_red));
                    age_valid_number_error.setVisibility(View.VISIBLE);
                }else{
                    System.out.println("test");
                    age_edit_text_box.setImageResource(R.drawable.rounded_rectangle2);

                    age_valid_number_error.setVisibility(View.GONE);

                }
                String usercity = city_edit_text.getText().toString();
                if (city_edit_text.getText().toString().trim().isEmpty()||usercity.matches(".*\\d.*")) {
                    city_edit_text_box.setImageResource(R.drawable.rounded_rectangle5);
                    city_edit_text.setTextColor(getResources().getColor(R.color.error_red));
                    city_valid_word_error.setVisibility(View.VISIBLE);
                }else{
                    city_edit_text_box.setImageResource(R.drawable.rounded_rectangle2);
                    city_valid_word_error.setVisibility(View.GONE);
                    city_edit_text.getText().clear();
                    age_edit_text.getText().clear();
                    open_form2_screen();


                }

                if (drivers_licence_radio_group.getCheckedRadioButtonId() == -1) {
//                temporary thing here until proper error checking gets added
                    System.out.println("nothing checked");
                }

            }
        });

//        how to make it so when clicked, color = 1, when clicked again, color deactivates and turns into 2
        get_wet_certification.setOnClickListener(v -> {
            if (get_wet_certification.isActivated()) {
                System.out.println("this is clicked");
            }
            else if (!get_wet_certification.isActivated()) {
                System.out.println("not clicked");
            }
        });

//        get_wet_certification.setOnClickListener(v -> get_wet_certification.setBackgroundResource(R.drawable.rounded_rectangle1));
        first_aid_certification.setOnClickListener(v -> first_aid_certification.setBackgroundResource(R.drawable.rounded_rectangle1));
        food_safe_certification.setOnClickListener(v -> food_safe_certification.setBackgroundResource(R.drawable.rounded_rectangle1));
        forklift_operator_certification.setOnClickListener(v -> forklift_operator_certification.setBackgroundResource(R.drawable.rounded_rectangle1));
        babysitting_certification.setOnClickListener(v -> babysitting_certification.setBackgroundResource(R.drawable.rounded_rectangle1));
        english_language.setOnClickListener(v -> english_language.setBackgroundResource(R.drawable.rounded_rectangle1));
        japanese_language.setOnClickListener(v -> japanese_language.setBackgroundResource(R.drawable.rounded_rectangle1));
        french_language.setOnClickListener(v -> french_language.setBackgroundResource(R.drawable.rounded_rectangle1));
        russian_language.setOnClickListener(v -> russian_language.setBackgroundResource(R.drawable.rounded_rectangle1));
        portuguese_language.setOnClickListener(v -> portuguese_language.setBackgroundResource(R.drawable.rounded_rectangle1));
        hindi_language.setOnClickListener(v -> hindi_language.setBackgroundResource(R.drawable.rounded_rectangle1));
        korean_language.setOnClickListener(v -> korean_language.setBackgroundResource(R.drawable.rounded_rectangle1));
        german_language.setOnClickListener(v -> german_language.setBackgroundResource(R.drawable.rounded_rectangle1));
        spanish_language.setOnClickListener(v -> spanish_language.setBackgroundResource(R.drawable.rounded_rectangle1));
        chinese_language.setOnClickListener(v -> chinese_language.setBackgroundResource(R.drawable.rounded_rectangle1));
    }

    private void open_form2_screen() {
        Intent open_form2_screen = new Intent(this, Form2Screen.class);
        startActivity(open_form2_screen);

    }
}
