package lab;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr = new int[] { 75, 129, 124, 129, 1, 28, 7, 28, 5, 7 };
        int i = 0;
        System.out.println("Elements in given array: ");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nDuplicate elements in given array: ");
        for (i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}
