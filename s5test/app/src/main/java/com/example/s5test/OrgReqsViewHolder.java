package com.example.s5test;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class OrgReqsViewHolder extends RecyclerView.ViewHolder {
    public OrgReqsViewHolder(@NonNull View itemView) {
        super(itemView);
        this.itemView = itemView;
        requirement = itemView.findViewById(R.id.specific_requirement);
    }

    View itemView;
    TextView requirement;
}