package lab.NumberConversion;

import java.util.*;

public class Decimal2Binary {
    public static void dec2bin(int input) {
        System.out.println("Inbuilt Method binary output:" + Integer.toBinaryString(input));
    }

    public static void dec2binManual(int input) {
        System.out.print("Manual Method binary output:");
        int remainder;
        Stack<Integer> stack = new Stack<Integer>();

        while (input > 0) {
            remainder = input % 2;
            input = input / 2;
            stack.add(remainder);
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.lastElement());
            stack.pop();
        }
        System.out.println();

    }
}
