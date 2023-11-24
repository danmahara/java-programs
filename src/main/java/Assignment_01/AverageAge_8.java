package Assignment_01;

import java.util.Scanner;

class AverageAge_8 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        short age1, age2, age3;
        float average;
        System.out.println("Enter age of three people\n");
        age1 = sc.nextShort();
        age2 = sc.nextShort();
        age3 = sc.nextShort();

        average = (age1 + age2 + age3) / 3;

        System.out.println("Average of three people age is: " + average);
        sc.close();
    }
}
