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
        abcFoodBank.opportunityApplyDate = "Start: Aug 10th";
        opportunityList.add(abcFoodBank);

        Organization canadianRedCross = new Organization();
        canadianRedCross.opportunityLogo = R.drawable.opportunity_logo2;
        canadianRedCross.opportunityName = "Supply Transporter";
        canadianRedCross.opportunityLocation = "Vancouver, B.C.";
        canadianRedCross.organizationName = "Canadian Red Cross";
        canadianRedCross.opportunityApplyDate = "Start: Apr 18th";
        opportunityList.add(canadianRedCross);

        Organization salvationArmy = new Organization();
        salvationArmy.opportunityLogo = R.drawable.opportunity_logo3;
        salvationArmy.opportunityName = "Amateur Chef";
        salvationArmy.opportunityLocation = "Vancouver, B.C.";
        salvationArmy.organizationName = "Salvation Army";
        salvationArmy.opportunityApplyDate = "Start: Apr 22nd";
        opportunityList.add(salvationArmy);

        Organization defRunForHealth = new Organization();
        defRunForHealth.opportunityLogo = R.drawable.opportunity_logo4;
        defRunForHealth.opportunityName = "10K Runner";
        defRunForHealth.opportunityLocation = "Vancouver, B.C.";
        defRunForHealth.organizationName = "DEF Run for Health";
        defRunForHealth.opportunityApplyDate = "Start: Jun 15th";
        opportunityList.add(defRunForHealth);

        Organization mastersOfYoga = new Organization();
        mastersOfYoga.opportunityLogo = R.drawable.opportunity_logo5;
        mastersOfYoga.opportunityName = "Yoga Instructor";
        mastersOfYoga.opportunityLocation = "Vancouver, B.C.";
        mastersOfYoga.organizationName = "Masters Of Yoga";
        mastersOfYoga.opportunityApplyDate = "Start: Feb 9th";
        opportunityList.add(mastersOfYoga);

        Organization buddhistsOfTaiChi = new Organization();
        buddhistsOfTaiChi.opportunityLogo = R.drawable.opportunity_logo6;
        buddhistsOfTaiChi.opportunityName = "Tai-Chi Instructor";
        buddhistsOfTaiChi.opportunityLocation = "Vancouver, B.C.";
        buddhistsOfTaiChi.organizationName = "Buddhists of Tai-Chi";
        buddhistsOfTaiChi.opportunityApplyDate = "Jun 20th";
        opportunityList.add(buddhistsOfTaiChi);

        Organization ghiHomes = new Organization();
        ghiHomes.opportunityLogo = R.drawable.opportunity_logo7;
        ghiHomes.opportunityName = "Tai-Chi Instructor";
        ghiHomes.opportunityLocation = "Vancouver, B.C.";
        ghiHomes.organizationName = "Buddhists of Tai-Chi";
        ghiHomes.opportunityApplyDate = "Start Mar 3rd";
        opportunityList.add(ghiHomes);

        Organization gardenBuilders = new Organization();
        gardenBuilders.opportunityLogo = R.drawable.opportunity_logo7;
        gardenBuilders.opportunityName = "Tai-Chi Instructor";
        gardenBuilders.opportunityLocation = "Vancouver, B.C.";
        gardenBuilders.organizationName = "Buddhists of Tai-Chi";
        gardenBuilders.opportunityApplyDate = "Start Oct 10th";
        opportunityList.add(ghiHomes);

    }

    private void open_on_boarding_screen() {
        Intent open_form1_screen = new Intent(this, OnBoardingScreen.class);
        startActivity(open_form1_screen);
    }
}