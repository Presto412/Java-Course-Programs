package lab;

import java.util.*;

class Student {
    public String Name, Regno, Phone;

    public void getInfo(String Name, String Regno, String Phone) {
        this.Name = Name;
        this.Regno = Regno;
        this.Phone = Phone;
    }

    public void displayInfo() {
        System.out.println("Name:" + Name + ", Regno:" + Regno + ", Phone:" + Phone);
    }

    public String getName() {
        return this.Name;
    }

    public static void sortobj(ArrayList<Student> students) {
        students.sort((s1, s2) -> {
            return s1.getName().compareTo(s2.getName());
        });
        for (Student student : students) {
            student.displayInfo();
        }
    }
}

class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<Student>();
        Student e;
        e = new Student();
        e.getInfo("Priyansh", "16BCE0979", "9879789878");
        studentList.add(e);
        e = new Student();
        e.getInfo("Rahul", "16BCE0971", "9879789871");
        studentList.add(e);
        e = new Student();
        e.getInfo("Rohan", "16BCE0972", "9879789872");
        studentList.add(e);
        e = new Student();
        e.getInfo("Mohit", "16BCE0973", "9879789873");
        studentList.add(e);
        e = new Student();
        e.getInfo("Oracle", "16BCE0949", "9879789874");
        studentList.add(e);
        System.out.println("The students in sorted order are:");
        Student.sortobj(studentList);
    }
}
