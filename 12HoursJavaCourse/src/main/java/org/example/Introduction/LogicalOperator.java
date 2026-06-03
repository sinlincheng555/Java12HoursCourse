package org.example.Introduction;

import java.util.Scanner;

public class LogicalOperator {
    public static  void main (String[] args){

        // && = and
        // || = OR
        // ! = NOT

        Scanner scanner = new Scanner(System.in);

        /*
        double temp;
        boolean isSunny;

        System.out.print("The temperature are: ");
        temp = scanner.nextDouble();

        System.out.println("Is it sunny outside(True/False)");
        isSunny = scanner.nextBoolean();

        if(temp <= 30 && temp >=0 && isSunny){
            System.out.println("The weather are good");
            System.out.println("It is sunny outside");
        }
        else if(temp <= 30 && temp >=0 && !isSunny) {
            System.out.println("The weather are good");
            System.out.println("But it is cloudy outside");
        }
        else if(temp > 30 || temp < 0){
            System.out.println("The weather is bad");
        }
        */

        //username system

        /*
            username must be between 4 - 12 characters
            username must not contain spaces or underscores
         */

        String username;

        System.out.print("Enter your new username: ");
        username = scanner.nextLine();

        if(username.length() < 4 || username.length() > 12){
            System.out.println("Username must be between 4 - 12 characters");
        }
        else if(username.contains(" ") || username.contains("_")){
            System.out.println("Username cant have under-score or spaces");
        }
        else{
            System.out.println("Welcome " + username);
        }

        scanner.close();
    }
}
