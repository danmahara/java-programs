package Assignment_02;

import java.util.Scanner;  

public class PrintingDaysSwitch_11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte choice;

        System.out.println("Enter number to display day: ");
        choice = sc.nextByte();

        switch (choice) {
            case 1:
                System.out.println("The day is Sunday");
                break;
            case 2:
                System.out.println("The day is Monday");
                break;
            case 3:
                System.out.println("The day is Tuesday");
                break;
            case 4:
                System.out.println("The day is Wednesday");
                break;
            case 5:
                System.out.println("The day is Thursday");
                break;
            case 6:
                System.out.println("The day is Friday");
                break;
            case 7:
                System.out.println("The day is Saturday");
                break;
            default:
                System.out.println("Invalid Input");
                break;

        }

    }

}
