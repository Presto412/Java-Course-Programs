package lab;

import java.util.HashMap;
import java.util.Scanner;

public class SubjectsTest {

    public static void main(String[] args) {
        int n;
        String name;
        HashMap<String, String[]> h1 = new HashMap<String, String[]>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter name of student " + (i + 1) + ":");
            name = sc.next();
            System.out.println("\nEnter the number of courses(max 3):");
            int c = sc.nextInt();
            String[] v = new String[3];
            System.out.println("\nEnter the name of courses:");
            for (int j = 0; j < c; j++) {
                v[j] = sc.next();
            }
            h1.put(name, v);
        }
        System.out.println("\nDo you want to remove any student record(y/n)?");
        String a = sc.next();
        if (a.equals("y")) {
            System.out.println("\nEnter name of student:");
            name = sc.next();
            h1.remove(a);
        }
        HashMap<String, String> h2 = new HashMap<String, String>();
        h2.put("Python", "111");
        h2.put("Maths", "222");
        h2.put("C", "333");
        h2.put("C++", "444");
        h2.put("Physics", "555");
        h2.put("Chemistry", "666");
        System.out.println("\nThe elements of hashmap h2 are:");
        System.out.println(h2);
        System.out.println("\nEnter the name of student to fetch the name of all those who teach her/him.");
        name = sc.next();
        for (int i = 0; i < 3; i++) {
            String value = h2.get(h1.get(name)[i]);
            if (value != null) {
                System.out.println(value);
            }
        }
    }

}
