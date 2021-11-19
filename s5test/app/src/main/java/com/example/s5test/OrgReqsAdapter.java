package com.example.s5test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class OrgReqsAdapter extends RecyclerView.Adapter<OrgReqsViewHolder>{

    Context context;
    ArrayList<String> requirements;

    OrgReqsAdapter(@NonNull Context context, @NonNull ArrayList<String> requirements) {
        this.context = context;
        this.requirements = requirements;
    }

    @NonNull
    @Override
    public OrgReqsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View itemView = inflater.inflate(R.layout.item_requirement, parent, false);
        OrgReqsViewHolder viewHolder = new OrgReqsViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull OrgReqsViewHolder holder, int position) {
        // populating recycler view with individual requirements from the requirements arraylist

        String requirement = requirements.get(position);
        holder.requirement.setText("- " + requirement);
    }

    public int getItemCount() {
        if (requirements == null) {
            return 0;
        }
        return requirements.size();
    }
}
