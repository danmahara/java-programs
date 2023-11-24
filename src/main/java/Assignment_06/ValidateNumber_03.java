
package Assignment_06; 
import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidateNumber_03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a number:");
            int a = sc.nextInt();
            System.out.println("You entered " + a);
        } catch (InputMismatchException e) {
//            System.out.println(e);
            System.err.println("Invalid number. Please enter a valid input");
        } 
        finally {
            sc.close();//The finally block ensures that the Scanner is closed to release system resources.
        }
    }
}
