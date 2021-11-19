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
        abcFoodBank.opportunityExpandedLogo = R.drawable.opportunity_image_group1;
        abcFoodBank.opportunityName = "Food Bank Helper";
        abcFoodBank.opportunityLocation = "Vancouver, B.C.";
        abcFoodBank.organizationName = "ABC Food Bank";
        abcFoodBank.opportunityApplyDeadline = "Application closes Aug 3rd, 2021";
        abcFoodBank.opportunityApplyDate = "Start: Aug 10th";
        abcFoodBank.opportunityExpandedDate = "Start by: Aug 10th";
        abcFoodBank.opportunityRequirements.add("Be 16 years or older.");
        abcFoodBank.opportunityRequirements.add("Pass a criminal background check.");
        abcFoodBank.opportunityRequirements.add("Be able to work together and be compassionate towards.");
        abcFoodBank.opportunityShortDescription = "Volunteer for us to help distribute food to those in need.";
        abcFoodBank.opportunityDescription = "ABC Food Bank provides free meals to anyone in need in the community.";
        humanitarianList.add(abcFoodBank);

        Organization canadianRedCross = new Organization();
        canadianRedCross.opportunityLogo = R.drawable.opportunity_logo2;
        canadianRedCross.opportunityExpandedLogo = R.drawable.opportunity_image_group2;
        canadianRedCross.opportunityName = "Supply Transporter";
        canadianRedCross.opportunityLocation = "Vancouver, B.C.";
        canadianRedCross.organizationName = "Canadian Red Cross";
        canadianRedCross.opportunityApplyDeadline = "Application closes Apr 11th, 2021";
        canadianRedCross.opportunityApplyDate = "Start: Apr 18th";
        canadianRedCross.opportunityExpandedDate = "Start by: Apr 18th";
        canadianRedCross.opportunityRequirements.add("Have a Class 5 Drivers License.");
        canadianRedCross.opportunityRequirements.add("Be able to volunteer for 3+ hours in a day.");
        canadianRedCross.opportunityRequirements.add("Pass a Criminal Background Check.");
        canadianRedCross.opportunityShortDescription = "Help transport supplies to charities that help those in need of food.";
        canadianRedCross.opportunityDescription = "The Canadian Red Cross is the leading humanitarian organization through which people voluntarily demonstrate their caring for others in need.";
        humanitarianList.add(canadianRedCross);

        Organization salvationArmy = new Organization();
        salvationArmy.opportunityLogo = R.drawable.opportunity_logo3;
        salvationArmy.opportunityExpandedLogo = R.drawable.opportunity_image_group3;
        salvationArmy.opportunityName = "Amateur Chef";
        salvationArmy.opportunityLocation = "Vancouver, B.C.";
        salvationArmy.organizationName = "Salvation Army";
        salvationArmy.opportunityApplyDeadline = "Application closes Apr 15th, 2021";
        salvationArmy.opportunityApplyDate = "Start: Apr 22nd";
        salvationArmy.opportunityExpandedDate = "Start by: Apr 22nd";
        salvationArmy.opportunityRequirements.add("Have a kitchen-safe certification.");
        salvationArmy.opportunityRequirements.add("Be able to work proficiently with kitchen tools.");
        salvationArmy.opportunityRequirements.add("Be at least 19 or older.");
        salvationArmy.opportunityShortDescription = "Cook for the Salvation Army to provide for orphanages and homeless shelters.";
        salvationArmy.opportunityDescription = "The Salvation Army is a Christian organization that gives hope and support to vulnerable people in 400 communities across Canada and in 132 countries.";
        humanitarianList.add(salvationArmy);

        Organization defRunForHealth = new Organization();
        defRunForHealth.opportunityLogo = R.drawable.opportunity_logo4;
        defRunForHealth.opportunityExpandedLogo = R.drawable.opportunity_image_group4;
        defRunForHealth.opportunityName = "10K Runner";
        defRunForHealth.opportunityLocation = "Vancouver, B.C.";
        defRunForHealth.organizationName = "DEF Run for Health";
        defRunForHealth.opportunityApplyDeadline = "Application closes Jun 8th, 2021";
        defRunForHealth.opportunityApplyDate = "Start: Jun 15th";
        defRunForHealth.opportunityExpandedDate = "Start by: Jun 15th";
        defRunForHealth.opportunityRequirements.add("Be 16 years or older.");
        defRunForHealth.opportunityRequirements.add("Wear appropriate clothing for all weather conditions.");
        defRunForHealth.opportunityShortDescription = "Participate in our 10K run as a volunteer to help us raise money for medical research.";
        defRunForHealth.opportunityDescription = "DEF Health Raises money for Medical Research.";
        fitnessList.add(defRunForHealth);

        Organization mastersOfYoga = new Organization();
        mastersOfYoga.opportunityLogo = R.drawable.opportunity_logo5;
        mastersOfYoga.opportunityExpandedLogo = R.drawable.opportunity_image_group5;
        mastersOfYoga.opportunityName = "Yoga Instructor";
        mastersOfYoga.opportunityLocation = "Vancouver, B.C.";
        mastersOfYoga.organizationName = "Masters Of Yoga";
        mastersOfYoga.opportunityApplyDeadline = "Application closes Feb 1st, 2021";
        mastersOfYoga.opportunityApplyDate = "Start: Feb 9th";
        mastersOfYoga.opportunityExpandedDate = "Start by: Feb 9th";
        mastersOfYoga.opportunityRequirements.add("Be able to communicate well with others.");
        mastersOfYoga.opportunityRequirements.add("Have a First-Aid/CPR certification.");
        mastersOfYoga.opportunityShortDescription = "Volunteer to teach yoga to different and diverse groups of people.";
        mastersOfYoga.opportunityDescription ="Masters of Yoga provides free yoga to the public to better help their well-being.";
        fitnessList.add(mastersOfYoga);

        Organization buddhistsOfTaiChi = new Organization();
        buddhistsOfTaiChi.opportunityLogo = R.drawable.opportunity_logo6;
        buddhistsOfTaiChi.opportunityExpandedLogo = R.drawable.opportunity_image_group6;
        buddhistsOfTaiChi.opportunityName = "Tai-Chi Instructor";
        buddhistsOfTaiChi.opportunityLocation = "Vancouver, B.C.";
        buddhistsOfTaiChi.organizationName = "Buddhists of Tai-Chi";
        buddhistsOfTaiChi.opportunityApplyDeadline = "Application closes Jun 13th, 2021";
        buddhistsOfTaiChi.opportunityApplyDate = "Start: Jun 20th";
        buddhistsOfTaiChi.opportunityExpandedDate = "Start by: Jun 20th";
        buddhistsOfTaiChi.opportunityRequirements.add("Be 16 years or older.");
        buddhistsOfTaiChi.opportunityRequirements.add("Wear appropriate clothing for all weather conditions.");
        buddhistsOfTaiChi.opportunityRequirements.add("Have some sort of previous construction experience.");
        buddhistsOfTaiChi.opportunityShortDescription = "Teach Tai-Chi to young adults and the elderly to help them de-stress and defend themselves.";
        buddhistsOfTaiChi.opportunityDescription = "GHI Homes helps build homes for families in poverty-stricken locations worldwide.";
        fitnessList.add(buddhistsOfTaiChi);

        Organization ghiHomes = new Organization();
        ghiHomes.opportunityLogo = R.drawable.opportunity_logo7;
        ghiHomes.opportunityExpandedLogo = R.drawable.opportunity_image_group7;
        ghiHomes.opportunityName = "Home Builder";
        ghiHomes.opportunityLocation = "Vancouver, B.C.";
        ghiHomes.organizationName = "GHI Homes";
        ghiHomes.opportunityApplyDeadline = "Application closes Feb 24th, 2021";
        ghiHomes.opportunityApplyDate = "Start: Mar 3rd";
        ghiHomes.opportunityExpandedDate = "Start by: Mar 3rd";
        ghiHomes.opportunityRequirements.add("Possess a worksite-safe certificate.");
        ghiHomes.opportunityRequirements.add("Be at least 18 years or older.");
        ghiHomes.opportunityRequirements.add("Have some sort of previous construction experience.");
        ghiHomes.opportunityShortDescription = "Join us to help build homes for families for the summer or support us with your donations.";
        ghiHomes.opportunityDescription = "GHI Homes helps build homes for families in poverty-stricken locations worldwide.";
        constructionList.add(ghiHomes);

        Organization gardenBuilders = new Organization();
        gardenBuilders.opportunityLogo = R.drawable.opportunity_logo8;
        gardenBuilders.opportunityExpandedLogo = R.drawable.opportunity_image_group8;
        gardenBuilders.opportunityName = "Garden bed Building";
        gardenBuilders.opportunityLocation = "Vancouver, B.C.";
        gardenBuilders.organizationName = "Garden Builders";
        gardenBuilders.opportunityApplyDeadline = "Application closes Oct 3rd, 2021";
        gardenBuilders.opportunityApplyDate = "Start: Oct 10th";
        gardenBuilders.opportunityExpandedDate = "Start by: Oct 10th";
        gardenBuilders.opportunityRequirements.add("Have common knowledge of agriculture tools.");
        gardenBuilders.opportunityRequirements.add("Be able to work safely with tools such as drills, hammers, nails, etc.");
        gardenBuilders.opportunityShortDescription = "Help us build garden beds for communities to plant flowers, fruits and vegetables.";
        gardenBuilders.opportunityDescription = "Garden Builders helps build gardens for communities that need a space to plant and grow various types of vegetation";
        constructionList.add(gardenBuilders);

        Organization rotaryFoundation = new Organization();
        rotaryFoundation.opportunityLogo = R.drawable.opportunity_logo9;
        rotaryFoundation.opportunityExpandedLogo = R.drawable.opportunity_image_group9;
        rotaryFoundation.opportunityName = "Setup Helper";
        rotaryFoundation.opportunityLocation = "Vancouver, B.C.";
        rotaryFoundation.organizationName = "Rotary Foundation";
        rotaryFoundation.opportunityApplyDeadline = "Application closes May 4th, 2021";
        rotaryFoundation.opportunityApplyDate = "Start: May 11th";
        rotaryFoundation.opportunityExpandedDate = "Start by: May 11th";
        rotaryFoundation.opportunityRequirements.add("Be 16 years or older");
        rotaryFoundation.opportunityRequirements.add("Be able to lift chairs and tables");
        rotaryFoundation.opportunityShortDescription = "Help out with an event for the Rotary Foundation that promotes youth education.";
        rotaryFoundation.opportunityDescription ="The Rotary Foundation is a non-profit corporation that supports the efforts of Rotary International to achieve world understanding and peace through international humanitarian, educational, and cultural exchange programs.";
        constructionList.add(rotaryFoundation);


        seniorAssistance.opportunityLogo = R.drawable.opportunity_image_group10;
        seniorAssistance.opportunityExpandedLogo = R.drawable.opportunity_image_group10;
        seniorAssistance.opportunityName = "Senior Assistance";
        seniorAssistance.opportunityLocation = "Vancouver, B.C.";
        seniorAssistance.organizationName = "N/A";
        seniorAssistance.opportunityApplyDeadline = "Application closes Jul 19th, 2021";
        seniorAssistance.opportunityApplyDate = "Start: Jul 26th";
        seniorAssistance.opportunityExpandedDate = "Start by: Jul 26th";
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