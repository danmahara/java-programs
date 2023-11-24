package Assignment_02;

import java.util.Scanner;

public class FindingGreaterAndOpe_07_2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a, b, c;
        System.out.println("\n\n");
        System.out.println("Enter 3 integers:\n");
        a = s.nextInt(); 
        b = s.nextInt();
        c = s.nextInt();

        if (a > b && a > c) {
            System.out.println( "Greater is: "+a);
        }
        
        else if(b>a&&b>c){
            System.out.println("Greater is: "+b);
        }
        else
            System.out.println("Greater is: "+c);
        System.out.println("\n\n");
    }
}
