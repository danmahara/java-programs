package Assignment_02;

import java.util.Scanner;

public class SmallestOne_05 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, c, d;
        System.out.println("Enter four integers : ");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        d = s.nextInt();
        if (a < b && a < c && a < d) {
            System.out.println(a + " is smallest one.");
        } else if (b < a && b < c && b < d) {
            System.out.println(b + " is smallest one.");
        } else if (c < a && c < b && c < d) {
            System.out.println(c + " is smallest one.");
        } else {
            System.out.println(d + " is smallest one.");
        }

    }
}
