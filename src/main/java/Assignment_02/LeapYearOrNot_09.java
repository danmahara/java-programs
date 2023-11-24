package Assignment_02;

import java.util.Scanner;

public class LeapYearOrNot_09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year;
        System.out.println("Enter year to check leap ");
        year = sc.nextInt();

        if (year % 400 == 0) {
            System.out.println(year + " is leap year");
        } else if (year % 100 == 0) {
            System.out.println(year + " is not leap year");

        } else if (year % 4 == 0) {
            System.out.println(year + " is leap year");

        }
        else{
            System.out.println(year+" is not leap year");
        }

    }
}
