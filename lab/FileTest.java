package lab;

import java.io.*;
import java.util.*;

class UserAccount {

    String paymentMode;
    long remotterPhone;
    double amt;
    long accountNo;
    String remotterName;

    public UserAccount(String paymentMode, double amt, long accountNo, String remotterName, long remotterPhone) {
        this.paymentMode = paymentMode;
        this.amt = amt;
        this.accountNo = accountNo;
        this.remotterName = remotterName;
        this.remotterPhone = remotterPhone;
    }
}

class UserAccountSystem {

    UserAccountHolder accountHolder;

    public void login() {
        try {

            FileInputStream fileInputStream = new FileInputStream("state");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            accountHolder = (UserAccountHolder) objectInputStream.readObject();
            objectInputStream.close();

        } catch (Exception e) {
            // e.printStackTrace();
        }
    }

    public void logout() {
        try {

            // accountHolder = new UserAccountHolder();
            ArrayList<UserAccount> accounts = new ArrayList<UserAccount>();
            FileOutputStream fileOutputStream = new FileOutputStream("state");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(accounts);
            objectOutputStream.flush();
            objectOutputStream.close();

        } catch (IOException e) {
            // e.printStackTrace();
        }
    }

}

class UserAccountHolder implements Serializable {

    ArrayList<UserAccount> accounts = new ArrayList<UserAccount>();
}

public class FileTest {

    public static void main(String[] args) throws IOException {

        File file = new File("state");
        if (file.createNewFile()) {
            System.out.println("state File Created in Project root directory");
        } else {
            System.out.println("File already exists in the project root directory");
        }

        UserAccountSystem accountSystem = new UserAccountSystem();

        accountSystem.login();

        accountSystem.accountHolder.accounts.add(new UserAccount("cash", 1000, 1501, "name1", 1231231231));
        accountSystem.accountHolder.accounts.add(new UserAccount("card", 2000, 1502, "name2", 1231231232));
        accountSystem.accountHolder.accounts.add(new UserAccount("upi", 3000, 1503, "name3", 1231231233));
        accountSystem.accountHolder.accounts.add(new UserAccount("bank", 4000, 1504, "name4", 1231231234));

        accountSystem.logout();

    }
}
