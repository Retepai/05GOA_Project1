package com.example.s5test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<Organization> opportunityList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        populateDataModel();
        open_on_boarding_screen();
    }

    void populateDataModel() {
        Organization abcFoodBank = new Organization();
        abcFoodBank.opportunityLogo = R.drawable.opportunity_logo1;
        abcFoodBank.opportunityName = "Food Bank Helper";
        abcFoodBank.opportunityLocation = "Vancouver, B.C.";
        abcFoodBank.organizationName = "ABC Food Bank";
        opportunityList.add(abcFoodBank);

        Organization CIBC = new Organization();
        CIBC.opportunityLogo = R.drawable.opportunity_logo1;
        CIBC.opportunityName = "CIBC Burger Flipper";
        CIBC.opportunityLocation = "Vancouver, B.C.";
        CIBC.organizationName = "CIBC";
        opportunityList.add(CIBC);
    }

    private void open_on_boarding_screen() {
        Intent open_form1_screen = new Intent(this, OnBoardingScreen.class);
        startActivity(open_form1_screen);
    }
}