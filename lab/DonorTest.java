package lab;

import java.io.*;
import java.util.*;
import java.text.*;

class Donor implements java.io.Serializable {

    String name, address, bgroup, contact;
    Date dold;
    int age;
    final static long serialVersionUID = 0;

    Donor(String name, String address, String bgroup, Date dold, String contact, int age) {
        this.name = name;
        this.address = address;
        this.bgroup = bgroup;
        this.dold = dold;
        this.contact = contact;
        this.age = age;
    }

    public void display() {
        System.out.println("name:" + name + ",address:" + address + ",bgroup:" + bgroup + ",contact:" + contact
                + ",dold:" + dold + ",age:" + age);
    }

}

class DonorTest {

    public static int getMonths(Date startDate, Date endDate) {
        Calendar startCalendar = new GregorianCalendar();
        startCalendar.setTime(startDate);
        Calendar endCalendar = new GregorianCalendar();
        endCalendar.setTime(endDate);

        int diffYear = endCalendar.get(Calendar.YEAR) - startCalendar.get(Calendar.YEAR);
        int diffMonth = diffYear * 12 + endCalendar.get(Calendar.MONTH) - startCalendar.get(Calendar.MONTH);
        return diffMonth;
    }

    public static void main(String[] args) throws IOException, ParseException {
        int n = 3;
        Donor donors[] = new Donor[n];
        Scanner sc = new Scanner(System.in);
        donors[0] = new Donor("Priyansh", "221B", "A+ve", new SimpleDateFormat("dd/MM/yyyy").parse("13/09/2018"),
                "1231231231", 21);
        donors[1] = new Donor("Rahul", "221B", "B+ve", new SimpleDateFormat("dd/MM/yyyy").parse("12/05/2018"),
                "1231231231", 21);
        donors[2] = new Donor("Ram", "221B", "A+ve", new SimpleDateFormat("dd/MM/yyyy").parse("12/04/2018"),
                "1231231231", 21);

        System.out.println("Donors are:");
        donors[0].display();
        donors[1].display();
        donors[2].display();

        String filename = "file.ser";
        try {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(donors);

            out.close();
            file.close();

            System.out.println("Donors have been serialized and written to file");

        } catch (IOException ex) {
            System.out.println("IOException is caught");
        }

        try {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            Donor[] savedDonors = (Donor[]) in.readObject();

            in.close();
            file.close();

            System.err.println("Donors with A+ve and Last date of Donation > 6mths:");
            for (Donor donor : savedDonors) {
                if (getMonths(donor.dold, new Date()) > 6 && donor.bgroup.equals("A+ve")) {
                    donor.display();
                }
            }

        }

        catch (IOException ex) {
            System.out.println("IOException is caught");
        }

        catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }

    }

}
