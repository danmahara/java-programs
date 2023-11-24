 package Assignment_02;

import java.util.Scanner;

class CalculatorByIfElse_12 {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        byte choice;
        float a, b;

        System.out.println("Choose your option");

//        while (true) {
            System.out.println("\n1.Addition \n2.Substraction \n3.Multliplication \n4.Division ");
            choice = s.nextByte();

//for exit program
            if (choice <1||choice>4) {
                System.exit(1);
            }

            System.out.println("Enter first number: ");
            a = s.nextInt();
            System.out.println("Enter second number:");
            b = s.nextInt();
            if (choice == 1) {
                float sum = a + b;
                System.out.println("Sum is : " + sum);

            } else if (choice == 2) {
                float sub = a - b;
                System.out.println("Substractionn  is : " + sub);
            } else if (choice == 3) {
                float mul = a * b;
                System.out.println("Multiplication  is : " + mul);
            } else {
                double div = a / b;
                System.out.println("division of is: " + div);
            }

        }

    }

//}
