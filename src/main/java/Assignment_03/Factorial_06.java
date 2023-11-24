 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_03;
import java.util.Scanner;

public class Factorial_06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     
        int i,num;
        double fact=1;
        System.out.println("Enter number to find factorial of:");
        num=sc.nextInt();
        
        for(i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+num+" is: "+fact);
    }
    
}
