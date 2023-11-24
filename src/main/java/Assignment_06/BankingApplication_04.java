package Assignment_06;

import java.util.Scanner;

class InsufficientFundsException extends Exception {

    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
//        System.out.println(initialBalance);
    }

    void deposit(double amount) {

        if (amount >= 10) {
            balance += amount;
            System.out.println("Successfully deposited Rs." + amount);
        } else {
            System.out.println("Can not deposit amount less than 10");
        }
    }
 
    void withdraw(double amount) throws InsufficientFundsException {

        if (amount < 10) {
            System.out.println("Can not withdraw amount less than 10");

        } else if (balance < 10) {
            System.out.println("Your balance is low Rs." + balance);
        } else if (balance >= amount) {
            balance -= amount;
            System.out.println("Successfully withdraw Rs." + amount);
        } else {
//            System.out.println("Insufficient amount");
            throw new InsufficientFundsException("Insufficient Balance " + balance);
        }
    }

    public double getAmount() {
        return balance;
    }

}

public class BankingApplication_04 {

    public static void main(String[] args) throws InsufficientFundsException {
        BankAccount account = new BankAccount(0);
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("1.Deposit \n2.Withdraw \n3.View balance \n4.Exit");
                int choice = sc.nextInt();
                double amount;
                switch (choice) {
                    case 1:
                        System.out.print("\nEnter your amount to deposite\t");
                        amount = sc.nextDouble();
                        account.deposit(amount);
                        break;
                    case 2:
                        System.out.print("Enter your amount to withdraw\t");
                        amount = sc.nextDouble();
                        account.withdraw(amount);
                        break;
                    case 3:
                        System.out.println("Balance Rs." + account.getAmount());
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Enter valid input");
                        break;
                }
            } catch (InsufficientFundsException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

//        try {
//            account.deposit(1000);
//            account.withdraw(1500);
//        } catch (InsufficientFundsException e) {
//            System.out.println("Error: "+e.getMessage()); 
//        }
//        System.out.println("Account Balance Rs." + account.getAmount());
    }
}
