package Assignment_02;

import java.util.Scanner;

class AnnualSalary_13 {
 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int salary;
        float total;
        System.out.println("Enter salary");
        salary = sc.nextInt();

        if (salary <= 400000) {
            total = salary - ((salary * 1) / 100);
            System.out.println("Your salary after deducting tax is Rs." + total);
        } 
        else if (salary > 400000 && salary <= 500000) {
            total = salary - ((salary * 10) / 100);
            System.out.println("Your salary after deducting tax is Rs." + total);

        } 
        else {
            total = salary - ((salary * 20) / 100);
            System.out.println("Your salary after deducting tax is Rs." + total);

        }

    }
}
