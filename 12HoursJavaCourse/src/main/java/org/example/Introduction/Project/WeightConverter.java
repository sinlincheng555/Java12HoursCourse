package org.example.Introduction.Project;
import java.util.Scanner;


public class WeightConverter {
    public static void main (String[] args) {

        // WEIGHT CONVERSION PROGRAM

    /*
            declare variables
            welcome message
            prompt for user choice
            option 1 convert lbs to kgs
            option 2 convert kgs to lbs
            else print not a valid choice
     */

        Scanner scanner = new Scanner(System.in);

        //declare varibles

        double weight;      //input weight
        double newWeight;   //output weight when changed
        int choice;

        //welcome message
        System.out.println("Weight conversion programs");
        System.out.println("1: convert lbs to kgs");
        System.out.println("2: convert kgs to lbs");

        System.out.println("Choose an option: ");
        choice = scanner.nextInt();

        //convert kgs to lbs
        if(choice == 1){
            System.out.print("Enter the weight in Lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.print("The new weight is in kgs is: " + newWeight);
        }
        else if(choice == 2){
            System.out.print("Enter the weight in Kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.print("The new weight is in lbs is: " + newWeight);
        }
        else {
            System.out.println("Invalid input");
        }

        scanner.close();

    }
}
