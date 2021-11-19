package com.example.s5test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class OrganizationScreen extends AppCompatActivity{

    OrgReqsAdapter OrgReqsAdapter;
    RecyclerView requirementsRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_opportunity_profile);
        Organization currentOrg = MainActivity.currentOrg;

        ImageView opportunity_image = findViewById(R.id.opportunity_image);
        TextView opportunity_name = findViewById(R.id.opportunity_name);
        TextView opportunity_location = findViewById(R.id.opportunity_location);
        TextView opportunity_expanded_date = findViewById(R.id.opportunity_expanded_date);
        TextView opportunity_short_description = findViewById(R.id.opportunity_short_description);
        TextView opportunity_description = findViewById(R.id.opportunity_description);

        opportunity_image.setImageResource(currentOrg.opportunityLogo);
        opportunity_name.setText(currentOrg.opportunityName);
        opportunity_location.setText(currentOrg.opportunityLocation);
        opportunity_expanded_date.setText(currentOrg.opportunityExpandedDate);
        opportunity_short_description.setText(currentOrg.opportunityShortDescription);
        opportunity_description.setText(currentOrg.opportunityDescription);

        setupRecyclerView();
    }

    void setupRecyclerView() {
        requirementsRecyclerView = findViewById(R.id.requirements_list_view);

        OrgReqsAdapter = new OrgReqsAdapter(this,MainActivity.currentOrg.opportunityRequirements);
        requirementsRecyclerView.setAdapter(OrgReqsAdapter);

        requirementsRecyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
    }
}
