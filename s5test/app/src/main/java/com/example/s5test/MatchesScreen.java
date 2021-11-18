package com.example.s5test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MatchesScreen extends AppCompatActivity {

    HumanitarianAdapter HumanitarianAdapter;
    FitnessAdapter FitnessAdapter;
    ConstructionAdapter ConstructionAdapter;
    RecyclerView humanitarianAidRecyclerView;
    RecyclerView fitnessRecyclerView;
    RecyclerView constructionRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.matches_screen);

        TextView matches_back_button = findViewById(R.id.matches_back_button);

        matches_back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_form2_screen();
            }
        });
        setupRecyclerView();
    }

    private void open_form2_screen() {
        Intent open_form2_screen = new Intent(this, Form2Screen.class);
        startActivity(open_form2_screen);
    }

    void setupRecyclerView() {
        humanitarianAidRecyclerView = findViewById(R.id.humanitarian_aid_list_view);
        fitnessRecyclerView = findViewById(R.id.fitness_list_view);
        constructionRecyclerView = findViewById(R.id.construction_list_view);

        HumanitarianAdapter = new HumanitarianAdapter(this,MainActivity.humanitarianList);
        humanitarianAidRecyclerView.setAdapter(HumanitarianAdapter);

        FitnessAdapter = new FitnessAdapter(this, MainActivity.fitnessList);
        fitnessRecyclerView.setAdapter(FitnessAdapter);

        ConstructionAdapter = new ConstructionAdapter(this, MainActivity.constructionList);
        constructionRecyclerView.setAdapter(ConstructionAdapter);

        humanitarianAidRecyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        fitnessRecyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        constructionRecyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
    }
}