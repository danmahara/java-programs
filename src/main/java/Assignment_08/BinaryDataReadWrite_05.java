package Assignment_08;

import java.io.*;

public class BinaryDataReadWrite_05 {

    public static void main(String[] args) {
        String fileName = "file.dat";

        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName));
            dos.writeInt(10);
            dos.writeDouble(15.555);
            dos.writeBoolean(true);
            System.out.println("Data write successfully");

        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        try {
            DataInputStream dis = new DataInputStream(new FileInputStream(fileName));
            int a = dis.readInt();
            double c = dis.readDouble();
            boolean b = dis.readBoolean();
            System.out.println("Integer " + a);
            System.out.println("Boolean " + b);
            System.out.println("Double " + c);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
