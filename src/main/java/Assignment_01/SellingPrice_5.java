package Assignment_01;

import java.util.Scanner;

class SellingPrice_5 {

    public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);

        float markedPrice;

        System.out.println("Enter the marked price of radio\t");
        markedPrice = scn.nextFloat();

        float total = markedPrice - (markedPrice * 30 / 100);

        System.out.println("Actual selling price is: " + total);
    }
}
