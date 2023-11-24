package Assignment_01;

import java.util.Scanner;

class TotalPrice_4 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int quantity;
        float price;
        float total;
        System.out.println("Enter number of product:\t");
        quantity = sc.nextInt();

        System.out.println("Enter price of product:\t");
        price = sc.nextFloat();

        total = quantity * price;

        System.out.println("Total amount is Rs." + total);

    }
}
