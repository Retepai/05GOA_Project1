package com.example.s5test;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class OrganizationScreen extends AppCompatActivity{

    OrgReqsAdapter OrgReqsAdapter;
    RecyclerView requirementsRecyclerView;
    static String clipText = "Employer’s email copied to clipboard.";
    static String employerEmail = "employerEmail@gmail.com";

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
        Button submit_button = findViewById(R.id.submit_form_button);

        opportunity_image.setImageResource(currentOrg.opportunityExpandedLogo);
        opportunity_name.setText(currentOrg.opportunityName);
        opportunity_location.setText(currentOrg.opportunityLocation);
        opportunity_expanded_date.setText(currentOrg.opportunityExpandedDate);
        opportunity_short_description.setText(currentOrg.opportunityShortDescription);
        opportunity_description.setText(currentOrg.opportunityDescription);

        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText(clipText,employerEmail);
                clipboard.setPrimaryClip(clip);
                alertPopup(OrganizationScreen.this);
            }
        });

        setupRecyclerView();
    }

    void setupRecyclerView() {
        requirementsRecyclerView = findViewById(R.id.requirements_list_view);

        OrgReqsAdapter = new OrgReqsAdapter(this,MainActivity.currentOrg.opportunityRequirements);
        requirementsRecyclerView.setAdapter(OrgReqsAdapter);

        requirementsRecyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
    }

    private void alertPopup(Context context) {
        new AlertDialog.Builder(context)
                .setTitle("Success!")
                .setMessage(clipText)
                .setPositiveButton("OK",null)
                .setIcon(R.drawable.check)
                .show();
    }
}
