/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_03;

public class Pattern12_14 {

    public static void main(String args[]) {
        byte i, j;
        char ch = 'A';
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }

    }
}
