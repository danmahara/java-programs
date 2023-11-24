 
package Assignment_09;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSetDemo_02 {
   
    public static void main(String[] args) {
        HashSet<String> strSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        // Add elements to the HashSet
        System.out.println("Enter strings to add to the set (enter 'exit' to stop):");
        String input;
        while (true) {
            input = sc.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            strSet.add(input);
        }

        // Display the contents of the HashSet
        System.out.println("Set Contents:");
        printHashSet(strSet);

        // Check for the presence of specific elements
        System.out.println("Enter a string to check its presence in the set:");
        String elementToCheck = sc.nextLine();
        if (strSet.contains(elementToCheck)) {
            System.out.println("'" + elementToCheck + "' is in the set.");
        } else {
            System.out.println("'" + elementToCheck + "' is not in the set.");
        }

        // Remove elements from the HashSet
        System.out.println("Enter a string to remove from the set:");
        String elementToRemove = sc.nextLine();
        if (strSet.remove(elementToRemove)) {
            System.out.println("'" + elementToRemove + "' has been removed from the set.");
        } else {
            System.out.println("'" + elementToRemove + "' was not found in the set.");
        }

        // Display the updated contents of the HashSet
        System.out.println("Updated Set Contents:");
        printHashSet(strSet);

        sc.close();
    }

    // Function to print a HashSet
    private static void printHashSet(HashSet<String> set) {
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
