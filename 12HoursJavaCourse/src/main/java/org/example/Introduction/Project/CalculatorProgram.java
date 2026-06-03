package org.example.Introduction.Project;

import java.util.Scanner;

public class CalculatorProgram {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

         double num1;
         double num2;
         char operator;
         double result = 0;
         boolean validOperator = true;

        System.out.print("Enter your first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter an operator(+, -, *, %, ^): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter your second number: ");
        num2 = scanner.nextDouble();

        switch (operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '%' -> result = num1 % num2;
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid input");
                validOperator = false;
            }
        }
        if(validOperator == true){
            System.out.println(result);
        }
        scanner.close();
    }
}
