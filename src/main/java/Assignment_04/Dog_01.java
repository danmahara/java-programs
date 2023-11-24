package Assignment_04;

public class Dog_01 {

    String name;
    int age;
    String color;
    static String owner = "Dan";

    void setName(String n) {

        name = n;
    }

    void setAge(int a) {
        age = a;

    }

    void setColor(String c) {
        color = c;

    }

    void printAll() {
        System.out.println("Dog name is " + name);
        System.out.println("Age is " + age);
        System.out.println("Color is " + color);
        System.out.println("Owner is " + owner);
        System.out.println();
    }

    public static void main(String[] args) {
        Dog_01 d1 = new Dog_01(); //object is created

        d1.setName("Jack");
        d1.setColor("Black");
        d1.setAge(1);
        d1.printAll();
        
        
        Dog_01 d2 = new Dog_01();
        d2.setName("Bob");
        d2.setAge(2);
        d2.setColor("White");
        d2.printAll();

    }

}
