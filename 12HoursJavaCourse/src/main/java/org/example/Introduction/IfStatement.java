package org.example.Introduction;
import java.util.Scanner;

public class IfStatement {
    public static void main (String[] args){

        //if statement = performs a block of code if its condition is true
        Scanner scanner = new Scanner(System.in);

        //setup
        String name;
        boolean isStudent;
        int age;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("What is your age: ");
        age = scanner.nextInt();

        System.out.print("Are you a student: ");
        isStudent = scanner.nextBoolean();

         if(name.isEmpty()){
             System.out.println("You didn't enter your name: ");
         }
         else{
             System.out.println("Hello " + name);
         }


        //running code
        if(age >= 65){
            System.out.println("You are too old to apply");
        }
        else if(age >= 18) {
            System.out.println("You are old enough able to apply");
        }
        else if(age == 16){
            System.out.println("You are close enough but we need to verify your grade before applying");
        }
        else {
            System.out.println("You are not old enough to apply");

        }

        if(isStudent){
            System.out.println("You are eligable to apply");
        }
        else {
            System.out.println("But you are not a student you cannot apply");
        }


        scanner.close();
    }

}
