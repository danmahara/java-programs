package Assignment_02;

import java.util.Scanner;

class FindigDivision_08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float sub1, sub2, sub3, sub4, sub5;
        float totalMarks;
        System.out.println("Enter marks of 5 subjects");
        sub1 = sc.nextFloat();
        sub2 = sc.nextFloat();
        sub3 = sc.nextFloat();
        sub4 = sc.nextFloat();
        sub5 = sc.nextFloat();

        totalMarks = sub1 + sub2 + sub3 + sub4 + sub5;
        float percentage;

        percentage = (totalMarks / 500) * 100;

        System.out.println("Total marks is " + totalMarks);
        System.out.println("Percentage is " + percentage);

        //finding division
        
        if(percentage>=80)
            System.out.println("Division-> Distinction"); 
        else if(percentage>=60&&percentage<=79)  
            System.out.println("Division-> Fist Division");
        else if(percentage>=45&&percentage<=59)
            System.out.println("Division-> Second Division");
     
        else if(percentage>=32&&percentage<=44)
            System.out.println("Division-> Third Division");
        else
            System.out.println("Division-> Fail, Study hard");
        
    }
}
