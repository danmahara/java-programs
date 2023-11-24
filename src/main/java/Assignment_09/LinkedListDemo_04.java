
package Assignment_09;
import java.util.LinkedList;
import java.util.Random;

public class LinkedListDemo_04 {
    public static void main(String[] args) {
        LinkedList<Integer> intList = new LinkedList<>();
        Random random = new Random();

        // Generate a random list of integers with at least 10 elements
        int listSize = random.nextInt(10)+10 ; // Random size between 10 and 19
        for (int i = 0; i < listSize; i++) {
            intList.add(random.nextInt(100)); // Random integers between 0 and 99
        }
 
        // Find and print the largest element in the list
        try {
            int largest = findLargest(intList);
            System.out.println("Random List of Integers: " + intList);
            System.out.println("Largest Element: " + largest);
        } catch (EmptyListException e) {
            System.err.println("Error: The list is empty.");
        }
    }

    // Function to find the largest element in a LinkedList of integers
    private static int findLargest(LinkedList<Integer> list) throws EmptyListException {
        if (list.isEmpty()) {
            throw new EmptyListException("The list is empty.");
        }

        int largest = list.getFirst();
        for (int num : list) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }

    // Custom exception class for an empty list
    static class EmptyListException extends Exception {
        public EmptyListException(String message) {
            super(message);
        }
    }
}
