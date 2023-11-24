package Assignment_02;

import java.util.Scanner;

public class ElectricityBill_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int unit;
        System.out.print("Enter your unit:\t");
        unit = sc.nextInt();

        float bill; 
        if (unit <= 150) {
            bill = unit * 3;
//            System.out.println("Your electricity Bill is Rs." + bill);
        } else if (unit <= 350) {
            bill =   (float) (100 + (unit - 150) * 3.75);

        } else if (unit <= 450) {
            bill = (float) (250 + (unit - 350) * 4);
        } else {
            bill = (float) (300 + (unit * 4.25));
        }

        System.out.println("Your bill is Rs. " + bill);

    }

}
