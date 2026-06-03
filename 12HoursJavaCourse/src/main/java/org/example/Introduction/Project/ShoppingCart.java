package org.example.Introduction.Project;
import java.util.Scanner;

public class ShoppingCart {
    public static void main (String[] args){

        // SHOPPING CART PROGRAM

        Scanner scanner = new Scanner(System.in);

        String items;
        double price;
        int quantity;
        char currency = '£';
        double total;


        System.out.print("What is the item you would like to buy?: ");
        items = scanner.nextLine();

        System.out.print("What is the price for each: ");
        price = scanner.nextDouble();

        System.out.print("How much are you are buying: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("You have bought " + quantity + " " + items);
        System.out.println("The total are: " + currency + total);

        scanner.close();

    }
}
