package com.example.s5test;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MatchesScreen extends AppCompatActivity {

    HumanitarianAdapter HumanitarianAdapter;
    FitnessAdapter FitnessAdapter;
    RecyclerView humanitarianAidRecyclerView;
    RecyclerView fitnessRecyclerView;
    RecyclerView constructionRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.matches_screen);
        setupRecyclerView();
    }

    void setupRecyclerView() {
        humanitarianAidRecyclerView = findViewById(R.id.humanitarian_aid_list_view);
        fitnessRecyclerView = findViewById(R.id.fitness_list_view);
        constructionRecyclerView = findViewById(R.id.construction_list_view);

        HumanitarianAdapter = new HumanitarianAdapter(this,MainActivity.humanitarianList);
        humanitarianAidRecyclerView.setAdapter(HumanitarianAdapter);

        FitnessAdapter = new FitnessAdapter(this, MainActivity.fitnessList);
        fitnessRecyclerView.setAdapter(FitnessAdapter);

        humanitarianAidRecyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        fitnessRecyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        constructionRecyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
    }
}