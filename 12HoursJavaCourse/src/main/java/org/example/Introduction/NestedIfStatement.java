package org.example.Introduction;
import java.util.Scanner;

public class NestedIfStatement {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        boolean isStudent;
        boolean isSenior;
        double price = 9.99;
        System.out.println("Are you a student");
        isStudent = scanner.nextBoolean();

        System.out.println("Are you a Senior");
        isSenior = scanner.nextBoolean();


        if(isStudent){
            if(isSenior){
                System.out.println("You are a senior discount 20%");
                System.out.println("You get a student discount 10% ");
                price *= 0.7;
            }
            else {
                System.out.println("You get a student discount 10% ");
                price *= 0.9;
            }
        }
        else {
            if(isSenior){
                System.out.println("You are a senior discount 20%");
                price *= 0.8;
            }
            else{
                price *= 1;
            }

        }

        System.out.println("The price of a ticket is: £" + price);

        scanner.close();
    }
}
