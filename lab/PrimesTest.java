package lab;

import java.util.Scanner;
import java.util.Stack;

import lab.primepackages.*;

public class PrimesTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter lower limit:");
        int lowerLimit = in.nextInt();
        System.out.print("\nEnter upper limit:");
        int higherLimit = in.nextInt();
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = lowerLimit; i <= higherLimit; i++) {
            if (Primes.checkForPrime(i)) {
                if (!stack.isEmpty()) {
                    int elem = stack.lastElement();
                    if (Math.abs(elem - i) == 2) {
                        System.out.printf("(%d, %d)", elem, i);
                    }
                }
                stack.add(i);
            }
        }
        in.close();
    }
}
