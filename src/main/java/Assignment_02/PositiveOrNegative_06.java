 
package Assignment_02;

import java.util.Scanner;
public class PositiveOrNegative_06 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("\n\nEnter a integer to find positive or negative.");
        num=sc.nextInt();
        
        if(num<-1)
            System.out.println(num+" negative");
        else
            System.out.println(num+" is positive");
        System.out.println("\n");
    }
}
