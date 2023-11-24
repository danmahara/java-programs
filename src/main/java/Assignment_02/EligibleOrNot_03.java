 
package Assignment_02;
import java.util.Scanner;

class EligibleOrNot_03 {
	public static void main(String args[]) {

		Scanner scn = new Scanner(System.in);

		System.out.println("\nEnter your age\t");
		int age = scn.nextInt();
		if (age >= 18) {
			System.out.println("You are eligible to vote");
		}

		else {
			System.out.println("You are not eligible to vote");
		}

	}
}