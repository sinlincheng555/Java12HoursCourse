package org.example.Introduction;
import java.util.Scanner;

public class UserInput {
    public static void main (String args[]) {

        Scanner scanner = new Scanner(System.in);
        {

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("What is your age: ");
            int age = scanner.nextInt();

            System.out.print("What is your gpa: ");
            double gpa = scanner.nextDouble();

            System.out.print("Are you a Student? (True or false): ");
            boolean isStudent = scanner.nextBoolean();

            System.out.println("Hello " + name + " and you are " + age + " year old");
            System.out.println("Your gpa are: " + gpa);

            if(isStudent){
                System.out.println("You are enrolled to the university");
            }
            else {
                System.out.println("You are not enrolled to the university");
            }


            scanner.close();

        }
    }
}
