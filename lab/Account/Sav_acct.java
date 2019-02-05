package lab.Account;

import java.util.Scanner;

public class Sav_acct extends Account {

    public void interest() {
        double interest = (balance * interestRate) / 12;
        System.out.println("Calculated interest : " + interest);

        scan = new Scanner(System.in);
        System.out.print("Do you want to update balance [y/n] : ");

        if (scan.next().toLowerCase().equals("y")) {
            balance += interest;
            System.out.println("Interest of Rs. " + interest + " is added to your account!!");
            System.out.println("Your current balance : " + balance);
        }

    }
}
