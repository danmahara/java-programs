 
package Assignment_09;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayListDemo_01 {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter integers to add to the list (enter 'exit' to stop):");
        while (true) {
            try {
                int num = sc.nextInt();
                numList.add(num);
            } catch (InputMismatchException e) {
                // Input is not an integer, break the loop
                String input = sc.next();
                if (input.equalsIgnoreCase("exit")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter an integer or 'exit' to stop.");
                }
            }
        }

        if (numList.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            System.out.println("Initial List:");
            printArrayList(numList);

            removeDuplicates(numList);
            System.out.println("List after removing duplicates:");
            printArrayList(numList);

            System.out.println("Enter an integer to remove from the list:");
            int numToRemove = sc.nextInt();
            removeElement(numList, numToRemove);
            System.out.println("List after removing " + numToRemove + ":");
            printArrayList(numList);
        }

        sc.close();
    }

    private static void removeDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> uniqueList = new ArrayList<>();
        for (Integer num : list) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }
        list.clear();
        list.addAll(uniqueList);
    }

    private static void removeElement(ArrayList<Integer> list, int element) {
        list.removeIf(num -> num == element);
    }

    private static void printArrayList(ArrayList<Integer> list) {
        for (Integer num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
