 
package Assignment_02;
import java.util.Scanner;

class GreaterOrSmallAndSum_04 {

    public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);

        System.out.println("\n\nEnter your first number\t");
        int a = scn.nextInt();

        System.out.println("Enter your second number\t");
        int b = scn.nextInt();

        if (a > b) {
            System.out.println("Greater is " + a + " your difference is: " + (a - b));
        } else {
            System.out.println("Greater is " + b + " your sum is: " + (a + b));
        }

    }
}
