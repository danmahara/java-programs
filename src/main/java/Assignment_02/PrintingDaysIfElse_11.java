package Assignment_02;

import java.util.Scanner;

public class PrintingDaysIfElse_11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to display day: ");
        byte choice = sc.nextByte();
        
        if(choice==1)
        System.out.println("The day is Sunday");
        
        else if(choice==2)
            System.out.println("The day is Monday");
        
        else if(choice==3)
            System.out.println("The day is Tuesday");
        
        else if(choice==4)
            System.out.println("The day is Wednesday");
        
        else if(choice==5)
            System.out.println("The day is Thursday");
        
        else if(choice==6)
            System.out.println("The day is Friday");
        
        else if(choice==7)
            System.out.println("The day is Saturday");
        
        else
            System.out.println("Invalid input");
    }
}
