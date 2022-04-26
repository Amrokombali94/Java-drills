package com.javaDrills.Main;

public class Main {
    public static void main(String[] args) {
        String firstName = "Darth";
        String lasName = "vader";
        String birthYear = "BBY";
        String homeWorld = "Tatooine";
        double height = 6.2;
        double weight = 196;

        /*part-1*/
        double purse = 150.0;
        purse -= 24.3;
        purse -= 45.0;
        purse *=2;
        purse = purse -(purse/10);

        System.out.println(purse);

        /*part-2*/
        String shipName = "Millenium Falcon";

        if (shipName == "Millenium Falcon"){
            System.out.println("let's go");
        } else {
            System.out.println("I better hide somewhere.");
        }

        /*part-3*/
        double itemCost;
        boolean isRecommendedItem;
        if (itemCost < 5 && isRecommendedItem){
            System.out.println("I will order it.");
        } else  {
            System.out.println("I will not order it.");
        }
        System.out.println("Hello world!");
    }
}