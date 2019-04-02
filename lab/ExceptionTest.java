package lab;

import java.util.*;

class NegativeAmountException extends Exception {

    double amount;

    NegativeAmountException(double amount) {
        this.amount = amount;
    }

    @Override
    public String getMessage() {
        return "Amount = " + amount + " cannot be negative";
    }
}

public class ExceptionTest {
    double balance;

    public ExceptionTest() {
        balance = 0;
    }

    public ExceptionTest(double balance) throws NegativeAmountException {
        if (balance < 0) {
            throw new NegativeAmountException(balance);
        } else {
            this.balance = balance;
        }
    }

    public void withdraw(double amount) throws NegativeAmountException {
        if (amount < 0) {
            throw new NegativeAmountException(amount);
        } else if (balance - amount < 0) {
            throw new NegativeAmountException(balance - amount);
        } else {
            balance -= amount;
        }
        System.out.println("Current balance: " + balance);
    }

    public void deposit(double amount) throws NegativeAmountException {
        if (amount < 0) {
            throw new NegativeAmountException(amount);
        } else {
            balance += amount;
        }
        System.out.println("Current balance: " + balance);
    }

    public static void main(String args[]) throws NegativeAmountException {
        Scanner sc = new Scanner(System.in);
        ExceptionTest eTest = new ExceptionTest();
        System.out.println("Deposit amt: ");
        double depositAmount = sc.nextDouble();
        eTest.deposit(depositAmount);
        System.out.println("Withdraw amt: ");
        double withdrawAmount = sc.nextDouble();
        eTest.withdraw(withdrawAmount);
    }
}
