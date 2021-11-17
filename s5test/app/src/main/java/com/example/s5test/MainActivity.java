package com.example.s5test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<Organization> opportunityList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        populateDataModel();


    }

    void populateDataModel() {
        Organization abcFoodBank = new Organization();
        abcFoodBank.opportunityLogo = R.drawable.opportunity_logo1;
        abcFoodBank.opportunityName = "Food Bank Helper";
        abcFoodBank.opportunityLocation = "Vancouver, B.C.";
        abcFoodBank.organizationName = "ABC Food Bank";
        opportunityList.add(abcFoodBank);

    }
}