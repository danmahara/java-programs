
package Assignment_03;
import java.util.Scanner;
public class SumOfNumDoWhile_03 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter a positive integer:");
        num=sc.nextInt();
        
       int i=1,sum=0;
       do{
           sum=sum+i;
           i++;
       }while(i<=num);
       float average=sum/num;
       
        
        System.out.println("Sum of "+num+" numbers is: "+sum);
        System.out.println("Average   is: "+average);
        
    }
    
}
