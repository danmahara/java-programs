package Assignment_04;

import java.util.Scanner;

public class School3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student3 s1 = new Student3();

        System.out.print("Enter student name:\t");
        s1.name = sc.nextLine();

        System.out.print("Enter student roll No. : \t");
        s1.roll = sc.nextInt();

        System.out.print("Enter student age : \t");
        s1.age = sc.nextInt();

//        System.out.print("Enter student name:\t");
//       String name=sc.nextLine();
//        System.out.print("Enter student roll No. : \t");
//        int roll=sc.nextInt();
//        System.out.println("Enter student age : \t");
//        int age=sc.nextInt();
        s1.displayDetails();
        s1.displayDetails(s1.name, s1.roll, s1.age);

    }
}
