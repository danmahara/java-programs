package Assignment_01;

import java.util.Scanner;

class LengthConverter_10 {

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        float meter;

        System.out.println("\n\n~~~~~~~~~~~~~~~~~~ Converter meter into centimenter ~~~~~~~~~~~~~~~~~~");
        System.out.println("\n1 meter is equals to 100 cm");

        System.out.println("\nEnter the length in meter ");
        meter = scn.nextFloat();

//100cm=1m;
        float centimeter = meter * 100;

        System.out.println("Your length in centimeter is: " + centimeter);

    }
}
