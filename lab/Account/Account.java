package lab.Account;

import java.util.Scanner;

public class Account {

    protected Scanner scan;
    protected String customerName;
    protected String accountType;
    protected int accountNumber;
    protected double balance;
    protected double interestRate, serviceCharge, minimum;

    public void openAccount(String accountType, double minimum, double serviceCharge, double interestRate) {

        this.minimum = minimum;
        this.serviceCharge = serviceCharge;
        this.interestRate = interestRate;
        this.accountType = accountType;

        scan = new Scanner(System.in);

        System.out.print("\nEnter customer name : ");
        this.customerName = scan.nextLine();

        System.out.print("Enter account number : ");
        this.accountNumber = scan.nextInt();

        System.out.print("Enter opening balance : ");
        this.balance = scan.nextDouble();

        System.out.println("Account created!!\n");

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void withdraw() {

        scan = new Scanner(System.in);

        System.out.print("\nEnter amount to withdraw : ");
        double withdrawAmount = scan.nextDouble();

        if (balance > withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println(
                    "Rs. " + withdrawAmount + " withdrawal from your account\n" + "Your current balance : " + balance);

            if (balance < minimum) {
                System.out.println(
                        "Information : Your current balance is less than minimum balance amount (Rs. " + minimum + ")");
            }
        } else {
            System.out.println("Sorry you don't have sufficient balance!!");
        }

    }

    public void deposit() {

        scan = new Scanner(System.in);

        System.out.print("\nEnter amount to be deposite : ");
        this.balance += scan.nextDouble();

        System.out.println("\nAmount deposited!!");

    }

    public void display() {

        scan = new Scanner(System.in);

        System.out.println("Customer name : " + customerName);
        System.out.println("Account type : " + accountType);
        System.out.println("Account number : " + accountNumber);
        System.out.println("Balance : " + balance);

    }
}
