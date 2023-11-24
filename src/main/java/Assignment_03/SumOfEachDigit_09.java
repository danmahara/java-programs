package Assignment_03;

import java.util.Scanner;

class SumOfEachDigit_09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, i,sum=0;
        System.out.println("Enter a number to find sum of each digit");
        num = sc.nextInt();
        
        for(i=1;i<=num;i++){
            sum+=i;
            
        }
        System.out.println("Total sum is "+sum);
        
    }
}
