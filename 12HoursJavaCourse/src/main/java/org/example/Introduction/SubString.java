package org.example.Introduction;
import  java.util.Scanner;

public class SubString {
    public static void main (String[] args){

        //.substring() = a method used to extract a portion of a string
        //                  string.substring(Start, end)

        Scanner scanner = new Scanner(System.in);

        String email = "sinlin@gmail.com";
        String username = email.substring(0,email.indexOf("@"));
        String domain = email.substring(email.indexOf("@") + 1);


        System.out.println(username);
        System.out.println(domain);

        // using scanner when making own email with requirement character
        String email1;
        String username1;
        String domain1;

        System.out.println("Enter your email:");
        email1 = scanner.nextLine();

        if(email1.contains(" ")){

            System.out.println("There is a space within the email");

        }
        else if (email1.contains("@")){

            username1 = email1.substring(0, email.indexOf("@"));
            domain1 = email1.substring(email1.indexOf("@") + 1);

            System.out.println(username1);
            System.out.println(domain1);
        }
        else{
            System.out.println("The email are invalid");
        }
        scanner.close();



    }
}
