package lab;

import java.util.*;

public class ThirdLargest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        sc.close();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Third Largest number in the array is " + (arr[n - 3]));
    }
}
