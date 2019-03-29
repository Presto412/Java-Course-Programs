package lab;

import java.util.*;

class RegistrationTest {

    public static void main(String[] args) {
        try {
            int i;

            System.out.println("Enter registration number:");
            Scanner in = new Scanner(System.in);
            String regNo = in.next();
            if (regNo.length() != 9) {
                throw new IllegalArgumentException("Incorrect Length!");
            }
            for (i = 0; i < regNo.length(); i++) {
                if (!Character.isLetterOrDigit(regNo.charAt(i))) {
                    throw new NoSuchElementException("Only letter/digit allowed in regNo");
                }
            }

            System.out.println("Enter mobile number:");
            String mobile = in.next();
            if (mobile.length() != 10) {
                throw new IllegalArgumentException("Incorrect Length!");
            }
            for (i = 0; i < mobile.length(); i++) {
                if (!Character.isDigit(mobile.charAt(i))) {
                    throw new NumberFormatException("Only numbers allowed in mobile");
                }
            }
            System.out.println("valid");
            in.close();

        } catch (Exception e) {
            System.out.println("invalid, message:" + e.getMessage());
        }
    }
}
