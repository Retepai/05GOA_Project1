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

    MatchesAdapter MatchesAdapter;
    RecyclerView humanitarianAidRecyclerView;
    RecyclerView fitnessRecyclerView;
    RecyclerView constructionRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.matches_screen);
        System.out.println("SCREEN:" + MainActivity.opportunityList.size());
        setupRecyclerView();
    }

    void setupRecyclerView() {
        humanitarianAidRecyclerView = findViewById(R.id.humanitarian_aid_list_view);
        fitnessRecyclerView = findViewById(R.id.fitness_list_view);
        constructionRecyclerView = findViewById(R.id.construction_list_view);

        MatchesAdapter = new MatchesAdapter(this,MainActivity.opportunityList);
        humanitarianAidRecyclerView.setAdapter(MatchesAdapter);
        fitnessRecyclerView.setAdapter(MatchesAdapter);
        constructionRecyclerView.setAdapter(MatchesAdapter);

        humanitarianAidRecyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
//        LinearLayoutManager hLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        LinearLayoutManager fLayoutManager = new LinearLayoutManager(this);
        LinearLayoutManager cLayoutManager = new LinearLayoutManager(this);
//        humanitarianAidRecyclerView.setLayoutManager(hLayoutManager);
        fitnessRecyclerView.setLayoutManager(fLayoutManager);
        constructionRecyclerView.setLayoutManager(cLayoutManager);






    }
}