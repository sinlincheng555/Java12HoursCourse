package org.example.Introduction;

public class Variables {
    public static void main (String args[]) {
    /*
            variable = a resuable container for a value
                        a variable behaves as if it was the value it contains

             ptimitive = simple value stored directly in memory (stack)
             reference = memory address (stack) that points to the (heap)

             primitive vs reference
            -------------------------
             int          string
             double       array
             char         object
             boolean

               steps to creating a variable
               -----------------------------
               1) declaration
               2) assignment
     */
        //int can only contain whole numbers unable to contain decimal
        int age = 19;
        int year = 2026;
        int quantity = 1;

        System.out.println("My age is " + age);
        System.out.println("The year is " + year);
        System.out.println(quantity);

        //double able to contain decimal numbers
        double price = 19.99;
        double gpa = 3.5;
        double temperature = -12.5;

        System.out.println("£" + price);
        System.out.println("Your average grade are " + gpa);
        System.out.println("The temperature are " + temperature);

        //char are single character
        char grade = 'A';
        char symbol = '!';
        char currency = '£';

        System.out.println("Your grade are " + grade);
        System.out.println("What is the Symbol = " + symbol);
        System.out.println("The currency that we use are " + currency);

        //boolean are the true or false
        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        System.out.println(isStudent);
        {
            if (isStudent) {
                System.out.println("You are University student");

            } else {
                System.out.println("You are not a University student");
            }
        }


        //Reference----------------------------------------------------------------------------

        //String series of character

        String name = "Sinlin Cheng";
        String food = "pizza";
        String email = "S.cheng@email";

        System.out.println("Hello" + name);
        System.out.println("what is your faviour food " + food);
        System.out.println("what is your email " + email);


    }
}
