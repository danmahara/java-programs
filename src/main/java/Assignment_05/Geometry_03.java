/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_05;

abstract class Shape {

    abstract void draw();
}

class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("Circle Drawn ");
    }
}

class Rectangle extends Shape {

    @Override
    void draw() {
        System.out.println("Rectangle Drawn");
    }
}

public class Geometry_03 {

    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.draw();
        r.draw();  
    }

}
