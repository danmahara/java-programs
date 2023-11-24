package Assignment_01;

import java.util.Scanner;

class AreaOfCircle_9 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        byte radius;
        double circumference;

        System.out.println("Enter radius of circle\t");
        radius = sc.nextByte();

        double pi;
        pi = Math.PI;

        // System.out.println("Value of pi is: "+pi);
        double area = pi * radius * radius;
        circumference = 2 * pi * radius;

        System.out.println("Area of circle is: " + area);
        System.out.println("Circumference of circle is: " + circumference);
        sc.close();
    }
}
