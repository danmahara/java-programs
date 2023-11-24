 package Assignment_03;

import java.util.Scanner;

public class SumTillUserWant_04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, sum;
        char ch;
        do { 
            System.out.println("Enter two numbers:");
            num1 = sc.nextInt();
            num2 = sc.nextInt();

            sum = num1 + num2;
//          float  average=(sum / 2);
            System.out.println("The sum is: " + sum);
//            System.out.println("Average is:" + average);
            System.out.println("Do you want to continue (y/n)");
            ch = sc.next().charAt(0);
        } while (ch == 'y');

    }

}
