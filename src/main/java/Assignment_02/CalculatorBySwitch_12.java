package Assignment_02;

import java.util.Scanner;

class CalculatorBySwitch_12 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        byte choice;
        float a, b;

        System.out.println("Choose your option");

//        while (true) {
        System.out.println("\n1.Addition \n2.Multliplication \n3.Substraction  \n4.Division ");
        choice = sc.nextByte();

//for exit program
            if (choice <1||choice>5) {
                System.exit(1);
            }
        System.out.println("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        switch (choice) {

            case 1:
                float sum = a + b;
                System.out.println("Sum of " + a + " and " + b + " is : " + sum);
                break;

            case 2:

                float mul = a * b;
                System.out.println("Multiplication of " + a + " and " + b + " is : " + mul);
                break;

            case 3:

                float sub = a - b;
                System.out.println("Substractionn of " + a + " and " + b + " is : " + sub);
                break;

            case 4:

                float div = a / b;
                System.out.println("division of " + a + " and " + b + " is : " + div);
                break;

//            default:
//                System.out.println("Invalid Input!");
//                break;
        }

    }

}
//}
