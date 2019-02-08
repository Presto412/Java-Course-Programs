package lab;

import java.util.*;

class Dependent {
    String dependentName;
    String dependentPhone;
    String dependentDob;

    public Dependent(String dependentName, String dependentPhone, String dependentDob) {
        this.dependentName = dependentName;
        this.dependentPhone = dependentPhone;
        this.dependentDob = dependentDob;
    }

}

abstract class Employee {
    protected String name;
    protected String empid;

    public Employee(String name, String empid) {
        this.name = name;
        this.empid = empid;
    }

    public abstract void calculateSalary();

    public abstract void displayInfo();
}

abstract class PermanentFaculty extends Employee {
    Dependent person;

    public PermanentFaculty(String name, String empid, String dname, String dphone, String ddob) {
        super(name, empid);
        person = new Dependent(dname, dphone, ddob);
    }

    public void displayInfo() {
        System.out.println(name + ", " + empid + ", " + person.dependentName + ", " + person.dependentPhone + ", "
                + person.dependentDob);
    }

}

abstract class ContractFaculty extends Employee {
    public ContractFaculty(String name, String empid) {
        super(name, empid);
    }

    public void displayInfo() {
        System.out.println(name + ", " + empid);
    }
}

class Professor extends PermanentFaculty {
    private final float basicSalary = 150000;

    public Professor(String name, String empid, String dname, String dphone, String ddob) {
        super(name, empid, dname, dphone, ddob);
    }

    @Override
    public void calculateSalary() {

        System.out.println("The basic salary is" + (basicSalary * 0.30));
    }
}

class AssociateProfessor extends PermanentFaculty {
    private final float basicSalary = 120000;

    public AssociateProfessor(String name, String empid, String dname, String dphone, String ddob) {
        super(name, empid, dname, dphone, ddob);
    }

    @Override
    public void calculateSalary() {

        System.out.println("The basic salary is" + (basicSalary * 0.20));
    }
}

class AssistantProfessor extends PermanentFaculty {
    private final float basicSalary = 100000;

    public AssistantProfessor(String name, String empid, String dname, String dphone, String ddob) {
        super(name, empid, dname, dphone, ddob);
    }

    @Override
    public void calculateSalary() {

        System.out.println("The basic salary is" + (basicSalary * 0.10));
    }
}

class TRA extends ContractFaculty {
    private final float basicSalary = 20000;

    public TRA(String name, String empid) {
        super(name, empid);
    }

    @Override
    public void calculateSalary() {

        System.out.println("The basic salary is" + (basicSalary));
    }
}

public class UniversityTest {
    public static void main(String[] args) {
        Employee e[] = new Employee[5];
        e[0] = new Professor("Priyansh", "111", "Jat", "23452", "1998");
        e[1] = new AssociateProfessor("Rahul", "222", "Bat", "456661", "1992");
        e[2] = new AssistantProfessor("Ram", "1428", "Cat", "565551", "1983");
        e[3] = new TRA("Nikhil", "1987");
        e[4] = new TRA("Rohan", "1949");
        boolean found = false;
        System.out.println("Enter the Employee id");
        Scanner in = new Scanner(System.in);
        String inputEmpId = in.nextLine();
        for (int i = 0; i < e.length; i++) {
            if (inputEmpId.equals(e[i].empid)) {
                e[i].calculateSalary();
                e[i].displayInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No such Employee id");
        }
    }
}
