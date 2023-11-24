package Assignment_05;

import java.util.Scanner;

// Shape interface
interface Shape {

    double getArea();

    void displayArea();
}

// Triangle class implementing Shape interface
class Triangle implements Shape {

    private double base;
    private double height;

    public Triangle(double base, double height) {//parameterized constructor
        this.base = base;
        this.height = height;

    }
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public void displayArea() {
        System.out.println("Triangle Area: " + getArea());
    }
}

// Circle class implementing Shape interface
class Circle implements Shape {

    private double radius;

    public Circle(double radius) {//parameterized constructor
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void displayArea() {
        System.out.println("Circle Area: " + getArea());
    }
}

public class Geometry_06 {

    public static void main(String[] args) {
//        Triangle triangle = new Triangle(5, 8);
//        Circle circle = new Circle(4);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers for triangle");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter radius for circle");
        int radius = sc.nextInt();
        Triangle t = new Triangle(a, b);
        Circle c = new Circle(radius);
 
//        triangle.displayArea();
//        circle.displayArea();
        t.displayArea();
        c.displayArea();
    }
}
