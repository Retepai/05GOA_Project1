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
        TextView human_empty_text = findViewById(R.id.humanitarian_empty_text);
        TextView fitness_empty_text = findViewById(R.id.fitness_empty_text);
        TextView construct_empty_text = findViewById(R.id.construction_empty_text);
        Button senior_apply_button = findViewById(R.id.senior_apply_button);

        matches_back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_form2_screen();
            }
        });

        senior_apply_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.currentOrg = MainActivity.seniorAssistance;
                open_org_screen();
            }
        });

        if (MainActivity.humanitarianList.size() == 0) {
            human_empty_text.setVisibility(View.VISIBLE);
        }
        if (MainActivity.fitnessList.size() == 0) {
            fitness_empty_text.setVisibility(View.VISIBLE);
        }
        if (MainActivity.constructionList.size() == 0) {
            construct_empty_text.setVisibility(View.VISIBLE);
        }

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

    private void open_org_screen() {
        Intent open_org_screen = new Intent(this, OrganizationScreen.class);
        startActivity(open_org_screen);
    }
}