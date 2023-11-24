package Assignment_08;

import java.io.*;

class CopyContent_03 {

    public static void main(String[] args) {
        try {
            String fileName = "myIntro.txt";
            String desFile = "des.txt"; 

            
            FileInputStream fis = new FileInputStream(fileName);// for read data of myIntro file
            int ch;
            FileOutputStream fos=new FileOutputStream(desFile);
            OutputStreamWriter osw=new OutputStreamWriter(fos);
            BufferedWriter writer=new BufferedWriter(osw);
            
            while ((ch = fis.read()) != -1) {
                writer.write((char)ch);
            }
            writer.close();// necessary to close to write any data
            System.out.println("Successfully copied");
        } catch (Exception e) { 
            System.out.println(e);
        }
    }
}

//package Assignment_08;
//
//import java.io.*;
//
//public class CopyContent_03 {
//
//    public static void main(String[] args) {
//        String sourceFile = "C:/Users/danma/OneDrive/Documents/NetBeansProjects/JavaAssignments/src/main/java/Assignment_08/myIntro.txt";
//        String destinationFile = "C:/Users/danma/OneDrive/Documents/NetBeansProjects/JavaAssignments/src/main/java/Assignment_08/destination.txt";
//
//        try {
//            FileInputStream fis = new FileInputStream(sourceFile);  // for read content
//            int ch;
//
//            FileOutputStream fos = new FileOutputStream(destinationFile);
//            OutputStreamWriter osw = new OutputStreamWriter(fos);
//            BufferedWriter writer = new BufferedWriter(osw);
//
//            while ((ch = fis.read()) != -1) {
//                writer.write(ch);// to wirte content of ch to destination.txt file
//            }
//            writer.close();
//
//            System.out.println("Data Copied Successfully");
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
//    }
//}
