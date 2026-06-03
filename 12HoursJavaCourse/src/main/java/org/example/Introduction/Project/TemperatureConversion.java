package org.example.Introduction.Project;
import java.util.Scanner;

public class TemperatureConversion {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String units;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        units = scanner.next().toUpperCase();

        newTemp = (units.equals("C")) ? (temp - 32 ) * 5 / 9 : (temp * 9 / 5 ) + 32;

        System.out.println(newTemp + units);



        scanner.close();
    }
}
