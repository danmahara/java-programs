     package Assignment_03;

import java.util.Scanner;

public class Armstrong_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        byte i;

        System.out.println("Enter a number to check armstrong or not");
        int num = sc.nextInt();
        int temp = num, rem, total = 0;
        while (temp != 0) {
            rem = temp %10;
            total = total + rem * rem * rem;
            temp /= 10;
        }

        if (total == num) {
            System.out.println("Number is armstrong");
        } else {
            System.out.println("Number is not armstrong ");
        }

    }
}
