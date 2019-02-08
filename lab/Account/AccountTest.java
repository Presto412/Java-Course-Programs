package lab.Account;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountTest {

    public static Account searchAccount(ArrayList<Account> accounts) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter account number : ");
        int accountNumber = in.nextInt();
        // in.close();
        for (Account tmpAccount : accounts) {
            if (tmpAccount.getAccountNumber() == accountNumber) {
                return tmpAccount;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scan;

        ArrayList<Account> accounts = new ArrayList<Account>();

        double interestRate = 0.15, serviceCharge = 100, minimum = 500;

        while (true) {

            scan = new Scanner(System.in);
            System.out.print("Open account [1],");
            System.out.print("Deposite [2],");
            System.out.print("Withdraw [3],");
            System.out.print("Interest [4],");
            System.out.print("Issue cheque [5],");
            System.out.print("Check for minimum balance [6],");
            System.out.print("Display account [7],");
            System.out.print("Exit [8]");
            System.out.println(">> ");

            int option = scan.nextInt();

            scan = new Scanner(System.in);
            switch (option) {

            case 1:
                System.out.print("\nEnter account type [sav / cur] : ");
                String accountType = scan.next();
                Account account = accountType.equals("sav") ? new Sav_acct() : new Cur_acct();
                account.openAccount(accountType, minimum, serviceCharge, interestRate);
                accounts.add(account);
                break;

            case 2:
                Account search = AccountTest.searchAccount(accounts);

                if (search == null) {
                    System.out.println("Sorry account not found!!");
                } else {
                    search.deposit();
                }
                break;

            case 3:
                search = AccountTest.searchAccount(accounts);

                if (search == null) {
                    System.out.println("Sorry account not found!!");
                } else {
                    search.withdraw();
                }
                break;

            case 4:
                search = AccountTest.searchAccount(accounts);

                if (search == null) {
                    System.out.println("Sorry account not found!!");
                } else if (search instanceof Sav_acct) {
                    ((Sav_acct) search).interest();
                } else {
                    System.out.println("Account type is not valid!!");
                }
                break;

            case 5:
                search = AccountTest.searchAccount(accounts);
                if (search == null) {
                    System.out.println("Sorry account not found!!");
                } else if (search instanceof Cur_acct) {
                    ((Cur_acct) search).issueCheque();
                } else {
                    System.out.println("Account type is not valid!!");
                }
                break;

            case 6:
                search = AccountTest.searchAccount(accounts);

                if (search == null) {
                    System.out.println("Sorry account not found!!");
                } else if (search instanceof Cur_acct) {
                    ((Cur_acct) search).checkBal();
                } else {
                    System.out.println("Account type is not valid!!");
                }
                break;

            case 7:
                search = AccountTest.searchAccount(accounts);

                if (search == null) {
                    System.out.println("Sorry account not found!!");
                } else {
                    search.display();
                }
                break;

            case 8:
                // scan.close();
                System.exit(0);

            }
        }
    }
}
