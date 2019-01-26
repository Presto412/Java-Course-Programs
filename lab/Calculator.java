package lab;

import java.util.*;

public class Calculator {
    public static void main(String args[]) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter First Number: ");
            int firstNumber = sc.nextInt();
            System.out.print("Enter Second Number: ");
            int secondNumber = sc.nextInt();
            System.out.println("Choose which operation to be performed: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtract");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
            case 1:
                System.out.println("Addition of first and second number is " + (firstNumber + secondNumber));
                break;
            case 2:
                System.out.println("Subtraction of first and second number is " + (firstNumber - secondNumber));
                break;
            case 3:
                System.out.println("Multiplication of first and second number is " + (firstNumber * secondNumber));
                break;
            case 4:
                System.out.println("Division of first and second number is " + (firstNumber / secondNumber));
                break;
            default:
                System.out.println("Invalid Option.");
            }
            sc.close();
        }

    }
}
