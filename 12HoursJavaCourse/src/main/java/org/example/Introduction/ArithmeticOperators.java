package org.example.Introduction;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int x = 10;
        int y = 2;
        int z;

        z = x + y;
        //z = x - y;
        //z = x * y;
        //z = x / y;
        //z = x % y;

        System.out.println(z);

        // Augmented assignment Operators - condensing the progress without declare a storage

        int xx = 10;
        int yy = 2;

        xx += yy;
        // xx -= yy;
        // xx *= yy;
        // xx /= yy;
        // xx %= yy;

        System.out.println(xx);

        // increment and decrement Operators

        int xxx = 1; //it add the number that is assigned to itself toward the symbol (adding itself)
        int xxx1 = 1;

        xxx1++;
        xxx1++;
        xxx1++;

        xxx--;
        xxx--;
        xxx--;


        System.out.println(xxx1);
        System.out.println(xxx);

        //Order of Operations [P-E-M-D-A-S]

            double result = 3 + 4;

            System.out.println(result);
    }
}
