package com.example.s5test;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class OrganizationScreen extends AppCompatActivity{

    OrgReqsAdapter OrgReqsAdapter;
    RecyclerView requirementsRecyclerView;
    static String clipText = "Employer’s email copied to clipboard.";
    static String employerEmail = "employerEmail@gmail.com";
    Boolean requirementsCollapse = true;
    Boolean descriptionCollapse = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_opportunity_profile);
        Organization currentOrg = MainActivity.currentOrg;

        TextView opportunity_profile_back_button = findViewById(R.id.opportunity_profile_back_button);
        TextView opportunity_apply_deadline = findViewById(R.id.opportunity_apply_deadline);
        ImageView opportunity_image = findViewById(R.id.opportunity_image);
        TextView opportunity_name = findViewById(R.id.opportunity_name);
        TextView opportunity_location = findViewById(R.id.opportunity_location);
        TextView opportunity_expanded_date = findViewById(R.id.opportunity_expanded_date);
        TextView opportunity_short_description = findViewById(R.id.opportunity_short_description);
        TextView opportunity_description = findViewById(R.id.opportunity_description);
        ImageButton requirements_collapse_button = findViewById(R.id.requirements_collapse_button);
        ImageButton description_collapse_button = findViewById(R.id.description_collapse_button);
        LinearLayout requirements_linear_layout = findViewById(R.id.requirements_linear_layout);
        Button submit_button = findViewById(R.id.submit_form_button);
        Button hide_button = findViewById(R.id.hide_opportunity_button);

        opportunity_apply_deadline.setText(currentOrg.opportunityApplyDeadline);
        opportunity_image.setImageResource(currentOrg.opportunityExpandedLogo);
        opportunity_name.setText(currentOrg.opportunityName);
        opportunity_location.setText(currentOrg.opportunityLocation);
        opportunity_expanded_date.setText(currentOrg.opportunityExpandedDate);
        opportunity_short_description.setText(currentOrg.opportunityShortDescription);
        opportunity_description.setText(currentOrg.opportunityDescription);

        opportunity_profile_back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_matches_screen();
            }
        });

        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText(clipText,employerEmail);
                clipboard.setPrimaryClip(clip);
                alertPopup(OrganizationScreen.this);
            }
        });

        hide_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MainActivity.humanitarianList.contains(currentOrg)) {
                    MainActivity.humanitarianList.remove(currentOrg);
                }
                else if (MainActivity.fitnessList.contains(currentOrg)) {
                    MainActivity.fitnessList.remove(currentOrg);
                }
                else if (MainActivity.constructionList.contains(currentOrg)) {
                    MainActivity.constructionList.remove(currentOrg);
                }
                finish();
                reload_matches();
            }
        });

        requirements_collapse_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (requirementsCollapse) {
                    requirementsRecyclerView.setVisibility(View.GONE);
                    requirements_linear_layout.setVisibility(View.GONE);
                    requirements_collapse_button.setBackgroundResource(R.drawable.expand_button);
                    requirementsCollapse = false;
                }
                else {
                    requirementsRecyclerView.setVisibility(View.VISIBLE);
                    requirements_linear_layout.setVisibility(View.VISIBLE);
                    requirements_collapse_button.setBackgroundResource(R.drawable.collapse_button);
                    requirementsCollapse = true;
                }
            }
        });

        description_collapse_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (descriptionCollapse) {
                    opportunity_description.setVisibility(View.GONE);
                    description_collapse_button.setBackgroundResource(R.drawable.expand_button);
                    descriptionCollapse = false;
                }
                else {
                    opportunity_description.setVisibility(View.VISIBLE);
                    description_collapse_button.setBackgroundResource(R.drawable.collapse_button);
                    descriptionCollapse = true;
                }
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

    private void open_matches_screen() {
        Intent open_matches_screen = new Intent(this, MatchesScreen.class);
        startActivity(open_matches_screen);
    }

    private void alertPopup(Context context) {
        new AlertDialog.Builder(context)
                .setTitle("Success!")
                .setMessage(clipText)
                .setPositiveButton("OK",null)
                .setIcon(R.drawable.check)
                .show();
    }

    private void reload_matches() {
        Intent reload = new Intent(this, MatchesScreen.class);
        startActivity(reload);
    }
}
