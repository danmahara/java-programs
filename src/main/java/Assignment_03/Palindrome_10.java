package Assignment_03;

import java.util.Scanner;

public class Palindrome_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();
        int temp = num;
        int rem, result = 0;
        while (temp != 0) {
            rem = temp % 10;
            result = result * 10+rem;
            temp /= 10;
        }
        if (num == result) {
            System.out.println(num + " is palindrome");
        } else {
            System.out.println(num + " is not palindrome");
        }
    }
}
