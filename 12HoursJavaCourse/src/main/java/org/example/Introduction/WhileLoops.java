package org.example.Introduction;

import java.util.Scanner;

public class WhileLoops {
    public static void main (String[] args){

        //while loop = repeat some code forever
        //              while some condition remains true

        Scanner scanner = new Scanner(System.in);

        String name = "";

        while(name.isEmpty()){
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);


        //to end loop

        String response = "";

        while(!response.equals("Q")){
            System.out.println("You are playing a game");
            System.out.print("press Q to quit the game: ");
            response = scanner.next().toUpperCase();
        }
        System.out.println("you have quite the game");

        int age = 0;

        System.out.println("Enter your age: ");
        age = scanner.nextInt();

        while(age < 0){
            System.out.println("Your age are invalid");
            System.out.print("Re-enter your age: ");
            age = scanner.nextInt();
        }

        System.out.println("Your are" + age + " year old");




        scanner.close();

    }
}
