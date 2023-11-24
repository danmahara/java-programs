package Assignment_08;

import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class User implements Serializable {

    private String name, email;
    private int age;

//    public User() {
        //default constructor
//    }

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    void setName() {
        this.name = name;
    }

    void setAge() {
        this.age = age;
    }

    void setEmail() {
        this.email = email;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    String getEmail() {
        return email;
    }
}

public class Main_06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you name,age Email");
        String name = sc.nextLine();
        int age = sc.nextInt();
        sc.nextLine();
        String email = sc.nextLine(); 

        User user = new User(name, age, email);

        try {
            FileOutputStream fos = new FileOutputStream("user_data.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(user);
            fos.close();
            oos.close();
            System.out.println("Data successfully saved to the uesr_data.dat");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
