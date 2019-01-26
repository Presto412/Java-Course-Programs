package lab;

import java.util.*;

public class Pascal {
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact = fact * i;
        return fact;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows to be printed: ");
        int num = in.nextInt();
        in.close();
        for (int i = 0; i < num; i++) {
            System.out.println("");
            for (int k = 0; k <= num - i + 1; k++)
                System.out.print(" ");
            for (int j = 0; j <= i; j++) {
                System.out.print(factorial(i) / (factorial(j) * factorial(i - j)));
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
}
