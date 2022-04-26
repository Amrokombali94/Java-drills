package com.javaDrills.Main;

public class FizzBuzz {
    public static void main(String[] args) {
        //  calling a fizzBuzz100 method inside the main after has been created outside the main method
        fizzBuzz100();
    }

    //creating fizzBuzz100 method with private access modifier that return void.


    private static void fizzBuzz100() {
        // creating a loop that's looping 100 times
        for (int i = 1; i <= 100; i++) {
            // printing fizz when it divides a number by 3 and the modulo is equal to 0
            if ((i % 3) == 0)
                System.out.println("fizz");
                // printing buzz when it divides a number by 5 and the modulo is equal to 0
            else if ((i % 5) == 0)
                System.out.println("buzz");
                // printing fizzbuzz when it divides a number by 3 and 5 and the modulo is equal to 0
            else if (((i % 5) == 0) && ((i % 3) == 0))
                System.out.println("fizzbuzz");
            else
                System.out.println(i);
        }
    }
}
