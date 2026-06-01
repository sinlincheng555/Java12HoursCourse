package org.example.Introduction;

public class Printf {
    public static void main (String[] args){

        //printf() = is a method used to format output
        //%[flags][width][.precision][specifier-character]

        String name = "Sinlin";
        char firstLetter = 'S';
        int age = 19;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s" , name);
        System.out.printf(" Your name start with a %c" , firstLetter);
        System.out.printf(" you are %d yeah old" , age);
        System.out.printf("You are %f inches tall" , height);
        System.out.printf("Employed: %b" , isEmployed);

        //
        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;

        System.out.printf("%f.1f" , price1);
        System.out.printf("%f.1f" , price2);
        System.out.printf("%f.1f" , price3);
    }
}
