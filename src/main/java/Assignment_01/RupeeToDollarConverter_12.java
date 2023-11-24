package Assignment_01;

import java.util.Scanner;

class RupeeToDollarConverter_12 {

    public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);

        float rupee, dollar;

        System.out.println("\n 1 dollar is equal to 132 rupee");
        System.out.println("\nEnter your rupee to convert into dollar\t");
        rupee = scn.nextFloat();

        dollar = rupee / 132;

        System.out.println("Your dollar is: " + dollar);
    }
}
