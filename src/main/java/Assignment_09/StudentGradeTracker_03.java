
package Assignment_09;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentGradeTracker_03 {

    public static void main(String[] args) {
        Map<String, Integer> studentGrades = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) { 
            System.out.println("\nStudent Grade Tracker Menu:");
            System.out.println("1. Add Student Grade");
            System.out.println("2. Remove Student Grade");
            System.out.println("3. Lookup Student Grade");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1/2/3/4): ");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addStudentGrade(studentGrades, sc);
                    break;
                case 2:
                    removeStudentGrade(studentGrades, sc);
                    break;
                case 3:
                    lookupStudentGrade(studentGrades, sc);
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option (1/2/3/4).");
            }
        }
    }

    private static void addStudentGrade(Map<String, Integer> studentGrades, Scanner sc) {
        System.out.print("Enter student name: ");
        String studentName = sc.nextLine();
        System.out.print("Enter student's grade: ");
        int grade = sc.nextInt(); 
        studentGrades.put(studentName, grade);
        System.out.println(studentName + "'s grade of " + grade + " has been added.");
    }

    private static void removeStudentGrade(Map<String, Integer> studentGrades, Scanner sc) {
        System.out.print("Enter student name to remove: ");
        String studentName = sc.nextLine();
        Integer removedGrade = studentGrades.remove(studentName);
        if (removedGrade != null) {
            System.out.println(studentName + "'s grade of " + removedGrade + " has been removed.");
        } else {
            System.out.println(studentName + " not found in the record.");
        }
    }

    private static void lookupStudentGrade(Map<String, Integer> studentGrades, Scanner sc) {
        System.out.print("Enter student name to lookup grade: ");
        String studentName = sc.nextLine();
        Integer grade = studentGrades.get(studentName);
        if (grade != null) {
            System.out.println(studentName + "'s grade is: " + grade);
        } else {
            System.out.println(studentName + " not found in the record.");
        } 
    } 
}
