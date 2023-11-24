
package Assignment_06;

public class NullRefrenceDemo_05 {
     public static void main(String[] args) {
        // Create a reference to an object without initializing it
        String uninitializedReference = null;

        try {
            // Attempt to perform an operation on the uninitialized reference
            int length = uninitializedReference.length(); // This will throw a NullPointerException
            System.out.println("Length of the string: " + length);
        } catch (NullPointerException e) {
            // Handle the NullPointerException
            System.err.println("NullPointerException caught: " + e.getMessage());
        }
    }
}
