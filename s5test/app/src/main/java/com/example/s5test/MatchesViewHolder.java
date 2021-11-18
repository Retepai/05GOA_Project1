package com.example.s5test;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MatchesViewHolder extends RecyclerView.ViewHolder {
    public MatchesViewHolder(@NonNull View itemView) {
        super(itemView);
        this.itemView = itemView;
        opportunityLogo = itemView.findViewById(R.id.opportunity_logo);
        opportunityName = itemView.findViewById(R.id.opportunity_name);
        opportunityLocation = itemView.findViewById(R.id.opportunity_location);
        organizationName = itemView.findViewById(R.id.organization_name);
        opportunityApplyDate = itemView.findViewById(R.id.opportunity_apply_date);
        opportunityApply = itemView.findViewById(R.id.opportunity_apply);
    }

    View itemView;
    ImageView opportunityLogo;
    TextView opportunityName;
    TextView opportunityLocation;
    TextView organizationName;
    TextView opportunityApplyDate;
    TextView opportunityApply;
}