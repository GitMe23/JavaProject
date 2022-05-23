package com.sparta.ah;

//Written by Andrewg
public class App 
{
    public static void main( String[] args ) {
        int timeOfDay = 21; //Strongly typed, Statically typed
        String welcomeMessage = greeting(timeOfDay);
        System.out.println(welcomeMessage);
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
            message = "Time of day entered is out of 24hr range";
        }
        return message;
    }
}
