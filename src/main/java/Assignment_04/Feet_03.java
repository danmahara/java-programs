package Assignment_04;

import java.util.Scanner;
public class Feet_03 {

    int  feet1, inch1, feet2, inch2;

    void setData() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first length");
        System.out.print("Enter feet ");
        feet1 = sc.nextInt();
        
        System.out.print("Enter inch");
        inch1 = sc.nextInt();
        
        System.out.println("Enter second length");
        System.out.print("Enter feet ");
        feet2 = sc.nextInt();
        
        System.out.print("Enter inch   ");
        inch2=sc.nextInt();
        
        
        if(inch1>=12){
            int additionalInch=inch1/12;
            feet1+=additionalInch;
            inch1%=12;
            
        }
        
        //Adding 
        feet1+=feet2;
        inch1+=inch2;
          
        if(inch1>=12){
            int additionalInch=inch1/12;
            feet1+=additionalInch;
            inch1%=12;
            
        }

    }

    void display() {
        System.out.println("Total length is " + feet1+" feet "+ inch1+ " inch");
    }

    public static void main(String[] args) {
        Feet_03 tl = new Feet_03();
        tl.setData();
        tl.display();

    }

}
