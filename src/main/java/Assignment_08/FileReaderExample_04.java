package Assignment_08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderExample_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the full path of the file to read
        System.out.print("Enter the full path of the file to read: ");
        String filePath = scanner.nextLine();

//        System.out.println("Current working directory: " + System.getProperty("user.dir"));
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            System.out.println("Content of the file:");

            // Read and display the content of the file line by line 
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
