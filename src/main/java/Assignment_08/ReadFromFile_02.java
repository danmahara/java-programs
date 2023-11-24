package Assignment_08;

import java.io.*;

public class ReadFromFile_02 {

    public static void main(String[] args) {
        String fileName = "myIntro.txt";
        try {
            FileInputStream fis = new FileInputStream(fileName);
            int ch;
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }
            fis.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

    }
}
