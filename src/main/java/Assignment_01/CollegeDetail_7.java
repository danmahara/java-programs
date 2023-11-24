package Assignment_01;

import java.util.Scanner;

class CollegeDetail_7 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String name, collegeName;
        short rollNo;

        System.out.println("Enter your name:\t");
        name = sc.nextLine();

        System.out.println("Enter your roll number:\t");
        rollNo = sc.nextShort();

        sc.nextLine();
        System.out.println("Enter your college name:\t");
        collegeName = sc.nextLine();

        System.out.println("\n\nYour name is: " + name);
        System.out.println("Your roll no. is: " + rollNo);
        System.out.println("Your college name is: " + collegeName);

    }
}
