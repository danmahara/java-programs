/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_03;

import java.util.Scanner;
import java.lang.Math;
public class CubeOfAllNumbers_11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a number to find cube of ");
        num = sc.nextInt();
        
        int i;
        double result;
       
        for(i=1;i<=num;i++){
            if(i%3==0){
                result=Math.pow(i, 3);
                System.out.println("Cube of "+ i +" is "+result);
            }
        }

    }
}
