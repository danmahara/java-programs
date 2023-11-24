/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_04;

import java.util.Scanner;
//class LargestAmongThree{
//    int a,b,c;
//    
//    void setData(){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter three numbers ");
//        a=sc.nextInt();
//        b=sc.nextInt();
//        c=sc.nextInt();
//        
//        
//    }
//    void display(){
//        if(a>b&&a>c)
//            System.out.println("Greater is "+ a);
//        else if(b>c&&b>a)
//            System.out.println("Greater is "+b);
//        else
//            System.out.println("Greater is "+c);
//        
//    }
//    
//}

public class Largest_02 {

    int a, b, c;

    void setData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

    }

    void display() {
        if (a > b && a > c) {
            System.out.println("Greater is " + a);
        } else if (b > c && b > a) {
            System.out.println("Greater is " + b);
        } else {
            System.out.println("Greater is " + c);
        }

    }

    public static void main(String[] args) {
//        LargestAmongThree l=new LargestAmongThree();
        Largest_02 l1 = new Largest_02();
        l1.setData();
        l1.display();
    }
   
}
