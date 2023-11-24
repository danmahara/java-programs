package Assignment_03;

import java.util.Scanner;
import java.lang.Math;

public class CalculatePower_07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int  base,power;
        System.out.println("Enter base");
        base = sc.nextInt();
        System.out.println("Enter power");
        power=sc.nextInt();
        
        System.out.println("Power is "+Math.pow(base,power));
        
    }
}
