package Assignment_01;

import java.util.Scanner;
import java.lang.Math;

class HoursIntoMinute_11 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        float hours, minute;

        System.out.println("Enter your hours to convert in minutes:\t");
        hours = sc.nextFloat();

        minute = hours * 60;

        System.out.println("Your hours converted into minute is: " + minute + " minutes");

    }
}
