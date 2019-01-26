package lab;

import java.util.*;

class Palindrome {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a number below to check if it is palindrome:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if (checkIfPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
        sc.close();
    }

    private static boolean checkIfPalindrome(int i) {
        int numDigits = numOfDigits(i);
        int digits[] = new int[numDigits];
        for (int j = 0; j < numDigits; j++) {
            digits[j] = i % 10;
            i /= 10;
        }
        for (int j = 0; j <= numDigits / 2; j++) {
            if (digits[j] == digits[numDigits - j - 1]) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    private static int numOfDigits(int i) {
        int digits = 0;
        while (i != 0) {
            digits++;
            i = i / 10;
        }
        return digits;
    }
}
