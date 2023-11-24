package Assignment_03;

public class Pattern6_14 {

    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            char ch = 'A';

            // Print the first i letters
            for (byte j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }

            System.out.println(); // Move to the next line
        }
    }
}
