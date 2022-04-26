package com.javaDrills.Main;

public class Main {
    /*part-1*/
    public static void main(String[] args) {
        String firstName = "Darth";
        String lasName = "vader";
        String birthYear = "BBY";
        String homeWorld = "Tatooine";
        double height = 6.2;
        double weight = 196;

        /*part-2*/
        double purse = 150.0;
        purse -= 24.3;
        purse -= 45.0;
        purse *=2;
        purse = purse -(purse/10);

        System.out.println(purse);

        /*part-3*/
        String handleColor = "black handle";

        String bladeColor = "purple blade";

        if (handleColor == "black handle" && bladeColor == "purple blade"){
            System.out.println("This one's mine!");
        } else {
            System.out.println("Pass");
        }

        String shipName = "Millenium Falcon";

        if (shipName == "Millenium Falcon"){
            System.out.println("let's go");
        } else {
            System.out.println("I better hide somewhere.");
        }

        double itemCost=5;
        boolean isRecommendedItem = true;
        if (itemCost < 5 && isRecommendedItem){
            System.out.println("I will order it.");
        } else  {
            System.out.println("I will not order it.");
        }
        double drinkCost=1;
        double drinkSize = 26;
        if (drinkCost < 1 && drinkSize > 24){
            System.out.println("I will order it.");
        } else  {
            System.out.println("I will not order it.");
        }
        /*part-4*/
    }
}