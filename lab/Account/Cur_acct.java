package lab.Account;

import java.util.Scanner;

public class Cur_acct extends Account {

    public void issueCheque() {
        scan = new Scanner(System.in);
        System.out.print("\nEnter amount : ");
        double amount = scan.nextDouble();

        System.out.println("Cheque issued for Rs. " + amount);
    }

    public void checkBal() {

        scan = new Scanner(System.in);

        if (balance < minimum) {
            balance -= serviceCharge;
            System.out.println("Your current balance is less than minimum balance amount (Rs. " + minimum + ")"
                    + " your account is discharged by Rs. " + serviceCharge);
        } else {
            System.out.println("Everything is good!!");
        }

    }

}
