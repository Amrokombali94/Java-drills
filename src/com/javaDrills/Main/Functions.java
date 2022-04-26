package com.javaDrills.Main;

public class Functions {
    public static void main(String[] args) {
    helloWorld();
    greeting("Khaled");

    System.out.println(add(4.00,5.00));

    System.out.println(thatOdd(10));


    }
   static void helloWorld() {

        System.out.println("hello, World");
    }

    static void greeting(String name) {
        System.out.println("Hello " + name);
    }

    static double add(double x, double y){
        return x+y;
    }
    static String thatOdd(int num){
        if (num/2 == 0){
            return "That’s not odd!";
        } else {
            return "That is odd indeed!";
        }
    }
    static String[] bigOrSmall (int[] arr){
        String[] answers =  new String[arr.length];
        for (int i = 0; i < answers.length; i++) {
            if (arr[i] > 100) {
                answers[i] = "big";
            } else {
                answers[i] = "small";
            }
        }
        return answers;
    }
}

