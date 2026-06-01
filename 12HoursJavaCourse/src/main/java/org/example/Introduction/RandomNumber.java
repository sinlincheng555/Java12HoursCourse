package org.example.Introduction;
import java.util.Random;

public class RandomNumber {
    public static void main (String[] args){

        // random number generator

        Random random = new Random();

        int numbers1;
        int numbers2;
        int numbers3;

        numbers1 = random.nextInt(0,101);
        numbers2 = random.nextInt(0,101);
        numbers3 = random.nextInt(0,101);

        System.out.println(numbers1);
        System.out.println(numbers2);
        System.out.println(numbers3);

        //double
        double numbers;

        numbers = random.nextDouble(1.0,100.0);

        System.out.println(numbers);

        //boolean

        boolean isHeads;

        isHeads = random.nextBoolean();

        if(isHeads) {
            System.out.println("It heads");
        }
        else {
            System.out.println("It tails");
        }
    }
}
