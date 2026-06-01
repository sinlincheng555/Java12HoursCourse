package org.example.Introduction.Project;
import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main (String[] args){

        // Compound interst calculator

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timeCompounded;
        int years;
        double amounts;

        System.out.println("Enter the principal amounts: ");
        principal = scanner.nextDouble();

        System.out.println("Enter the interest rate: ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the number of compounded per year: ");
        timeCompounded = scanner.nextInt();

        System.out.println("Enter the numbers of years going to be saved: ");
        years = scanner.nextInt();

        amounts = principal * Math.pow(1 + rate / timeCompounded, timeCompounded * years);

        System.out.println("the amount after " + years + " is: £" + amounts);








        scanner.close();
    }
}
