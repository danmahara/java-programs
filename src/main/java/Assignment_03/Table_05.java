 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_03;

import java.util.Scanner;
public class Table_05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        byte i,n;
        
        System.out.println("Enter the number you want table of:");
        n=sc.nextByte();
        for(i=1;i<=10;i++){
            System.out.println(n+" * "+i+" ="+(n*i));
        }
        
    }
    
}
