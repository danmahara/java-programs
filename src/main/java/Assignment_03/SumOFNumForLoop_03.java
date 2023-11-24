
package Assignment_03;

import java.util.Scanner;
public class SumOFNumForLoop_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int a,i,sum=0;
        System.out.println("Enter a positive integer :");
        a=sc.nextInt();
        for(i=1;i<=a;i++){
           sum=sum+i; 
           
        }
        
        float average=sum/a;
        
        System.out.println("Sum is: "+sum);
        System.out.println("Average  is: "+average);
        
        
    }
}
