package Assignment_08;

//import java.io.FileOutputStream;
//import java.io.OutputStreamWriter;
//import java.io.BufferedWriter;
//import java.io.IOException;
import java.io.*;

public class TextFileDemo_01 {

    public static void main(String[] args) {
        try {
            // Create a FileOutputStream with the desired file path
            String fileName = "myIntro.txt";
            FileOutputStream fos = new FileOutputStream(fileName);

            // Create an OutputStreamWriter to write text data
            OutputStreamWriter osw = new OutputStreamWriter(fos);

            // Create a BufferedWriter to efficiently write text
            BufferedWriter writer = new BufferedWriter(osw);

            // Write sample text data into the file
            writer.write("Name - Dan Mahara\n");
            writer.write("Age - 20\n");
            writer.write("Address - Kailali, Nepal\n");
            // Close the BufferedWriter and OutputStreamWriter
            writer.close();
            osw.close();

            System.out.println("Text file created successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred while creating or writing to the file: " + e.getMessage());
        }
    }
}
