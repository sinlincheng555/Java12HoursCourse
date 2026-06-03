package org.example.Introduction;

public class ternaryOperator {
    public static void main (String[] args){

        // ternary operator ? = return 1 of 2 values if a condition is true

        // variables = (condition) ? ifTrue : ifFalse

        int score = 70;

        /*
        if(score >= 70){
            System.out.println("pass");
        }
        else {
            System.out.println("Fail");
        }


         */

        //pass or fail
        String passOrFail = (score >= 70) ? "pass" : "Fail";

        System.out.println(passOrFail);

        //even or odd
        int numbers = 4;
        String evenOrOdd = (numbers % 2 == 0) ? "even" : "odd";

        System.out.println(evenOrOdd);

        //timer teller

        int hours = 13;
        String timeOfDay = (hours < 12) ? "AM" : "PM";

        System.out.println(timeOfDay);
    }
}
