package com.example.s5test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MatchesAdapter extends RecyclerView.Adapter<MatchesViewHolder>{

    Context context;
    ArrayList<Organization> opportunityCompactList;

    MatchesAdapter(@NonNull Context context, @NonNull ArrayList<Organization> opportunityCompactList) {
        this.context = context;
        this.opportunityCompactList = opportunityCompactList;
    }

    @NonNull
    @Override
    public MatchesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View itemView = inflater.inflate(R.layout.item_opportunity_compact, parent, false);
        MatchesViewHolder viewHolder = new MatchesViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MatchesViewHolder holder, int position) {
        // Taking information from opportunityCompactList and populating recycler view with specific data from each organization
        Organization organization = opportunityCompactList.get(position);
        holder.opportunityLogo.setImageResource(organization.opportunityLogo);
        holder.opportunityName.setText(organization.opportunityName);
        holder.opportunityLocation.setText(organization.opportunityLocation);
        holder.organizationName.setText(organization.organizationName);

//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mainActivity.setCurrentRestaurant(restaurant);
//                mainActivity.open_screen(new RestaurantFragment());
//            }
//        });
//    }
    }

    public int getItemCount() {
        if (opportunityCompactList == null) {
            return 0;
        }
        return opportunityCompactList.size();
    }
}
