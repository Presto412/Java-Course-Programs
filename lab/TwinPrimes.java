package lab;

import java.util.Scanner;

import lab.primepackages.*;

public class TwinPrimes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter lower limit:");
        int lowerLimit = in.nextInt();
        System.out.print("\nEnter upper limit:");
        int higherLimit = in.nextInt();
        int lastPrime = -1;
        for (int i = lowerLimit; i <= higherLimit; i++) {
            if (Primes.checkForPrime(i)) {
                if (lastPrime == -1) {
                    lastPrime = i;
                    continue;
                }
                if (Math.abs(lastPrime - i) == 2) {
                    System.out.printf("(%d, %d)", lastPrime, i);
                }
                lastPrime = i;
            }
        }
        System.out.println();
        in.close();
    }
}
