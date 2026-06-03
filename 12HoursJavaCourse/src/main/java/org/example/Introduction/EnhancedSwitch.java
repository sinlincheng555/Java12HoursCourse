package org.example.Introduction;

import java.util.Scanner;

public class EnhancedSwitch {
    public static void main (String[] args){

        //enhanced switch = a replacemnet to mamy else if statment

        Scanner scanner = new Scanner(System.in);
        String day;

        System.out.print("What is the day of the week: ");
        day = scanner.next();

        day = day.substring(0,1).toUpperCase() + day.substring(1).toLowerCase();


        switch(day){
            case "Monday" -> System.out.print("It is a weekday");
            case "Tuesday" -> System.out.print("It is a weekday");
            case "Wednesday" -> System.out.print("It is a weekday");
            case "Thursday" -> System.out.print("It is a weekday");
            case "Friday" -> System.out.print("It is a weekday");
            case "Saturday" -> System.out.print("It is a weekend");
            case "Sunday" -> System.out.print("It is a weekend");
            default -> System.out.println("Invalid error");
        }

        scanner.close();
    }
}
