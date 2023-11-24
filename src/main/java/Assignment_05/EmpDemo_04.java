package Assignment_05;

import java.util.Scanner;

class Employee {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }    

    public void setAge(int age) {
        this.age = age;
    }

    public void display() {
        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
public class EmpDemo_04 {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
       

        employees[0] = new Employee();
        employees[0].setName("Dan");
        employees[0].setAge(20);

        employees[1] = new Employee();
        employees[1].setName("John");
        employees[1].setAge(25);

        employees[2] = new Employee();
        employees[2].setName("Bob");
        employees[2].setAge(20);

        employees[3] = new Employee();
        employees[3].setName("Eva");
        employees[3].setAge(19);

        employees[4] = new Employee();
        employees[4].setName("Sonam");
        employees[4].setAge(22);

 

       Employee youngestEmployee = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() < youngestEmployee.getAge()) {
                youngestEmployee = employees[i];
            }
        }
      System.out.println("Youngest Employee:");
        youngestEmployee.display();
    }
}
