package practice;

import java.util.*;

class Anagram {

    static String sort(String input) {
        char chars1[] = input.toCharArray();
        Arrays.sort(chars1);
        return new String(chars1);
    }

    static void anagram(String input1, String input2) {
        input1 = sort(input1);
        input2 = sort(input2);
        if (input1.equals(input2)) {
            System.out.println("Anagram");
            return;
        }
        System.out.println("Not anagram");

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = "MasterChef";
        String b = "ChefMaster";
        String c = "MasterBhef";
        in.close();
        anagram(a, b);
        anagram(a, c);
    }
}
