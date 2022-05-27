package com.sparta.ah;

import java.util.ArrayList;
import java.util.Date;

//Written by Andrew
public class App 
{
    public static void main( String[] args ) {
        Date date = new Date();
        int hour = date.getHours();
        String welcomeMessage;
        welcomeMessage = greeting(hour);
        System.out.println(welcomeMessage);

        System.out.println("Information on the projects in my repository can be found in the readme.md file.");
        System.out.println("Tests for all of my programs can be found in their respective test classes.");


    }

    public static String greeting(int timeOfDay) {
        String message;
        if (timeOfDay >= 0 && timeOfDay <= 11) {
            message = "Good Morning!";
        } else if (timeOfDay >= 12 && timeOfDay <=18) {
            message = "Good Afternoon!";
        } else if (timeOfDay <= 23){
            message = "Good Evening!";
        } else {
            message = "";
        }
        return message;
    }


}
