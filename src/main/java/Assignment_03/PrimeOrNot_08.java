package Assignment_03;

import java.util.Scanner;

public class PrimeOrNot_08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, num;
        byte flag = 0;
        System.out.println("Enter a number to find prime");
        num = sc.nextInt();
        if (num == 0 || num == 1) {
//            System.out.println(num + " is not prime num");
            flag = 1;
        }
        for (i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                flag = 1;
                break;
            }

        }

        if (flag == 0) {
            System.out.println(num + " is prime number");
        } else {
            System.out.println(num + " is not prime number");
        }

    }

}
