package lab.NumberConversion;

import java.util.*;

public class Decimal2Hexa {
    public static void dec2hex(int input) {
        System.out.println("Inbuilt Method Hexadecimal output:" + Integer.toHexString(input));
    }

    public static void dec2hexManual(int input) {
        System.out.print("Manual Method Hexadecimal output:");
        int remainder;
        String characters = "0123456789abcdef";
        Stack<Character> stack = new Stack<Character>();
        while (input > 0) {
            remainder = input % 16;
            stack.add(characters.charAt(remainder));
            input /= 16;
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.lastElement());
            stack.pop();
        }
        System.out.println();
    }
}
