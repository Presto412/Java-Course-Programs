package lab;

import java.util.Scanner;

class Userpassword {
    public static void main(String[] args) {
        String username, password, confirmPassword;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Username:");
        username = in.nextLine();
        System.out.print("\nEnter Password:");
        password = in.nextLine();
        System.out.print("\nEnter Confirm Password:");
        confirmPassword = in.nextLine();

        if (username.length() < 8) {
            System.out.println("Incorrect Username length");
        }
        if (password.length() < 8) {
            System.out.println("Incorrect password length");

        }

        if (username.indexOf(" ") != -1) {
            System.out.println("Username shouldn't contain spaces");
        }
        if (password.indexOf(" ") != -1) {
            System.out.println("Password shouldn't contain spaces");
        }

        if (!password.equals(confirmPassword)) {
            System.out.println("Password doesn't Match confirm password");
        }
        for (int i = 0; i < username.length() - 3; i++) {
            String substr = username.substring(i, i + 3);
            if (password.indexOf(substr) != -1) {
                System.out.println("password cannot contain username");
                break;
            }
        }
        in.close();
    }
}
