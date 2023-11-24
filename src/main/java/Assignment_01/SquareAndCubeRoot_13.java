
package Assignment_01;

import java.util.Scanner;
import java.lang.Math;

class SquareAndCubeRoot_13 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number:");
        float square = sc.nextFloat();

        System.out.println("Square of " + square + " is " + (square * square));
        System.out.println("Cube of " + square + " is " + (square * square*square));
        
        System.out.println("Square root value is: " + Math.sqrt(square));


    }
}
