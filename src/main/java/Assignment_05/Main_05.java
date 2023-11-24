/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_05;

// Define the Calculate interface
interface Calculate {
    int add(int x, int y);
    int diff(int x, int y); 
}

// Implement the Calculate interface in a class
class Calculator implements Calculate {
    @Override
    public int add(int x, int y) {
        return x + y;
    }

    @Override
    public int diff(int x, int y) {
        return x - y;
    }
}

public class Main_05 {
    public static void main(String[] args) {
        // Create an instance of the Calculator class
         Calculator calculator = new Calculator();

        // Perform addition and subtraction using the implemented methods
        int sum = calculator.add(10, 5);
        int difference = calculator.diff(10, 5);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}

