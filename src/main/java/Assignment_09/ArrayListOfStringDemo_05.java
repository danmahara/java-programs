
 package Assignment_09;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOfStringDemo_05 {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
//            System.out.println("\nEnter Your choice:");
            System.out.println("\n1. Add a String");
            System.out.println("2. Remove a String by Index");
            System.out.println("3. Display Contents");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1/2/3/4): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addString(stringList, scanner);
                    break;
                case 2:
                    removeStringByIndex(stringList, scanner);
                    break;
                case 3:
                    displayContents(stringList);
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option (1/2/3/4).");
            }
        }
    }

    private static void addString(ArrayList<String> list, Scanner scanner) {
        System.out.print("Enter a string to add: ");
        String newString = scanner.nextLine();
        list.add(newString);
        System.out.println("'" + newString + "' has been added to the list.");
    }
 
    private static void removeStringByIndex(ArrayList<String> list, Scanner scanner) {
        if (list.isEmpty()) {
            System.out.println("The list is empty. Nothing to remove.");
            return;
        }

        System.out.print("Enter the index of the string to remove (0-" + (list.size() - 1) + "): ");
        int index = scanner.nextInt();

        if (index >= 0 && index < list.size()) {
            String removedString = list.remove(index);
            System.out.println("'" + removedString + "' has been removed from the list.");
        } else {
            System.out.println("Invalid index. Please enter a valid index.");
        }
    }

    private static void displayContents(ArrayList<String> list) {
        if (list.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            System.out.println("List Contents:");
            for (int i = 0; i < list.size(); i++) {
                System.out.println("Index " + i + ": " + list.get(i));
            }
        }
    }
}
