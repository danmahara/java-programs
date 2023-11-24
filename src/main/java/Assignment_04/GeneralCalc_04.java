package Assignment_04;
import java.util.Scanner;
public class GeneralCalc_04 {
    int a, b,add,diff,mul;
 
    void setData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        a = sc.nextInt();
        b = sc.nextInt();

    }

    void sum() {
         add = a + b;

    }

    void difference() {
         diff = a - b;

    }

    void product() {
         mul = a * b;

    }

    void displayData() {
        System.out.println("Sum is "+ add);
        System.out.println("Difference is "+ diff);
        System.out.println("Product is "+ mul);
    }

    public static void main(String[] args) {
        GeneralCalc_04 calc = new GeneralCalc_04();
        calc.setData();
        calc.sum();
        calc.difference();
        calc.product();
        calc.displayData();
    }
 
}
