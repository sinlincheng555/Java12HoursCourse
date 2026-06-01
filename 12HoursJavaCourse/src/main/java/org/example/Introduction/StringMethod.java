package org.example.Introduction;

public class StringMethod {
    public static void main (String[] args) {


        String name = "Sinlin Cheng";
        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf(" ");
        int lastIndex = name.lastIndexOf("l");

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);

        name = name.toUpperCase();
        //name = name.toLowerCase();
        // name = name.trim();
        //name = name.replace("C","H");

        System.out.println(name);

        if (name.isEmpty()) {
            System.out.println("Your name is empty");
        } else {
            System.out.println("Hello " + name);
        }

        if(name.contains(" ")){
            System.out.println("Your name contains a space");
        }
        else{
            System.out.println("Your name doesn't contains any spaces");
        }


        if(name.equalsIgnoreCase("password")){
            System.out.println("Your name cant be Password");
        }
        else{
            System.out.println("Hello " + name);
        }
    }
}
