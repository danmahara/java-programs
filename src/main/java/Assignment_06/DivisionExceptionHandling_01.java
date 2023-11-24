
package Assignment_06;
import java.util.Scanner;

public class DivisionExceptionHandling_01 {
    DivisionExceptionHandling_01(){
        Scanner sc=new Scanner(System.in);
        
        try {
        System.out.print("Enter two integers for x and y:");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=x/y;
        System.out.println("x/y = "+z);
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        new DivisionExceptionHandling_01();
    }
}
