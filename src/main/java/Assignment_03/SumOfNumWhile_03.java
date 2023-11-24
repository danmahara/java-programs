 
package Assignment_03;
import java.util.Scanner;
public class SumOfNumWhile_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        
        System.out.println("Enter how many number of sum want:");
        num=sc.nextInt();
        
        int i=1,sum=0;
        while(i<=num){
          sum=sum+i;
          i++;
        }
        float average=sum/num;
       
        System.out.println("Sum is: "+sum);
        System.out.println("Average is: "+average);
        
    }
}
