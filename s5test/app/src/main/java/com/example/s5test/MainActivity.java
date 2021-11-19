package com.example.s5test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<Organization> humanitarianList = new ArrayList<>();
    public static ArrayList<Organization> fitnessList = new ArrayList<>();
    public static ArrayList<Organization> constructionList = new ArrayList<>();

    public static Organization currentOrg = new Organization();
    public static Organization seniorAssistance = new Organization();

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
        humanitarianList.add(abcFoodBank);

        Organization canadianRedCross = new Organization();
        canadianRedCross.opportunityLogo = R.drawable.opportunity_logo2;
        canadianRedCross.opportunityName = "Supply Transporter";
        canadianRedCross.opportunityLocation = "Vancouver, B.C.";
        canadianRedCross.organizationName = "Canadian Red Cross";
        canadianRedCross.opportunityApplyDate = "Start: Apr 18th";
        humanitarianList.add(canadianRedCross);

        Organization salvationArmy = new Organization();
        salvationArmy.opportunityLogo = R.drawable.opportunity_logo3;
        salvationArmy.opportunityName = "Amateur Chef";
        salvationArmy.opportunityLocation = "Vancouver, B.C.";
        salvationArmy.organizationName = "Salvation Army";
        salvationArmy.opportunityApplyDate = "Start: Apr 22nd";
        humanitarianList.add(salvationArmy);

        Organization defRunForHealth = new Organization();
        defRunForHealth.opportunityLogo = R.drawable.opportunity_logo4;
        defRunForHealth.opportunityName = "10K Runner";
        defRunForHealth.opportunityLocation = "Vancouver, B.C.";
        defRunForHealth.organizationName = "DEF Run for Health";
        defRunForHealth.opportunityApplyDate = "Start: Jun 15th";
        fitnessList.add(defRunForHealth);

        Organization mastersOfYoga = new Organization();
        mastersOfYoga.opportunityLogo = R.drawable.opportunity_logo5;
        mastersOfYoga.opportunityName = "Yoga Instructor";
        mastersOfYoga.opportunityLocation = "Vancouver, B.C.";
        mastersOfYoga.organizationName = "Masters Of Yoga";
        mastersOfYoga.opportunityApplyDate = "Start: Feb 9th";
        fitnessList.add(mastersOfYoga);

        Organization buddhistsOfTaiChi = new Organization();
        buddhistsOfTaiChi.opportunityLogo = R.drawable.opportunity_logo6;
        buddhistsOfTaiChi.opportunityName = "Tai-Chi Instructor";
        buddhistsOfTaiChi.opportunityLocation = "Vancouver, B.C.";
        buddhistsOfTaiChi.organizationName = "Buddhists of Tai-Chi";
        buddhistsOfTaiChi.opportunityApplyDate = "Start: Jun 20th";
        fitnessList.add(buddhistsOfTaiChi);

        Organization ghiHomes = new Organization();
        ghiHomes.opportunityLogo = R.drawable.opportunity_logo7;
        ghiHomes.opportunityName = "Home Builder";
        ghiHomes.opportunityLocation = "Vancouver, B.C.";
        ghiHomes.organizationName = "GHI Homes";
        ghiHomes.opportunityApplyDate = "Start: Mar 3rd";
        constructionList.add(ghiHomes);

        Organization gardenBuilders = new Organization();
        gardenBuilders.opportunityLogo = R.drawable.opportunity_logo8;
        gardenBuilders.opportunityName = "Gardenbed Building";
        gardenBuilders.opportunityLocation = "Vancouver, B.C.";
        gardenBuilders.organizationName = "Garden Builders";
        gardenBuilders.opportunityApplyDate = "Start: Oct 10th";
        constructionList.add(gardenBuilders);

        Organization rotaryFoundation = new Organization();
        rotaryFoundation.opportunityLogo = R.drawable.opportunity_logo9;
        rotaryFoundation.opportunityName = "Setup Helper";
        rotaryFoundation.opportunityLocation = "Vancouver, B.C.";
        rotaryFoundation.organizationName = "Rotary Foundation";
        rotaryFoundation.opportunityApplyDate = "Start: May 11th";
        constructionList.add(rotaryFoundation);

        seniorAssistance.opportunityLogo = R.drawable.recommended_match_picture1;
        seniorAssistance.opportunityName = "Senior Assistance";
        seniorAssistance.opportunityLocation = "Vancouver, B.C.";
        seniorAssistance.organizationName = "N/A";
        seniorAssistance.opportunityApplyDate = "Start: May 11th";
        seniorAssistance.opportunityExpandedDate = "Start by: May 11th";
        seniorAssistance.opportunityRequirements.add("Be 16 years or older");
        seniorAssistance.opportunityRequirements.add("Have previous customer service skills");
        seniorAssistance.opportunityRequirements.add("Talk and engage with residents");
        seniorAssistance.opportunityShortDescription = "Help assist elders in your community Vancouver, B.C. Wisteria Senior’s Home";
        seniorAssistance.opportunityDescription = "Wisteria Place is an innovative seniors’ living community in the spectacular waterfront community of Steveston, BC. At Wisteria Place, we provide activities and facilitate connections between our residents and the community, to help foster a sense of purpose. We are a community hub. We connect cultures.";
    }

    private void open_on_boarding_screen() {
        Intent open_form1_screen = new Intent(this, OnBoardingScreen.class);
        startActivity(open_form1_screen);
    }
}