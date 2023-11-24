package Assignment_01;
 
import java.util.Scanner;

class NetSalary_6 {

    public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);
        float salary, tax, allowance;
        float netSalary;
        System.out.println("Enter your salary\t");
        salary = scn.nextFloat();

        tax = (salary * 20) / 100;
        allowance = (salary * 30) / 100;
        netSalary = salary - tax - allowance;

        System.out.println("Your tax amount is: " + tax);
        System.out.println("Your allowance amount is: " + allowance);
        System.out.println("Your net income is: " + netSalary);

    }
}
