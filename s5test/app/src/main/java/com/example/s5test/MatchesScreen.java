package com.example.s5test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MatchesScreen extends AppCompatActivity {

    View view;
    MatchesAdapter MatchesAdapter;
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
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        humanitarianAidRecyclerView.setLayoutManager(layoutManager);
        MatchesAdapter = new MatchesAdapter(this, MainActivity.opportunityList);
        humanitarianAidRecyclerView.setAdapter(MatchesAdapter);
        fitnessRecyclerView.setAdapter(MatchesAdapter);
        constructionRecyclerView.setAdapter(MatchesAdapter);

//        humanitarianAidRecyclerView = view.findViewById(R.id.humanitarian_aid_list_view);
//        fitnessRecyclerView = view.findViewById(R.id.fitness_list_view);
//        constructionRecyclerView = view.findViewById(R.id.construction_list_view);


    }
}