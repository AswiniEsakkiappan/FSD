package Day_11;

import java.util.*;

class Student {
    int id;
    String name;
    String department;
    int marks;

    Student(int id, String name, String department, int marks) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.marks = marks;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Marks: " + marks);
        System.out.println(" -------------------- ");
    }
}

public class Studen_Management_task {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        HashSet<Integer> ids = new HashSet<>();

        // Adding 5 students

        Student s1 = new Student(101, "Aswini", "BCA", 95);
        Student s2 = new Student(102, "Priya", "BSc", 88);
        Student s3 = new Student(103, "Kavi", "BCA", 92);
        Student s4 = new Student(104, "Ram", "BCom", 78);
        Student s5 = new Student(105, "Anu", "BSc", 85);

        Student[] data = {s1, s2, s3, s4, s5};

        for (Student s : data) {
            if (ids.add(s.id)) {
                students.add(s);
            }
        }

        // Display all students

        System.out.println("ALL STUDENT RECORDS");

        Iterator<Student> it = students.iterator();

        while (it.hasNext()) {
            Student s = it.next();
            s.display();
        }

        // Duplicate ID checking

        System.out.println("DUPLICATE CHECK");

        Student s6 = new Student(101, "Arun", "BCA", 90);

        if (ids.contains(s6.id)) {
            System.out.println("Duplicate Student ID not allowed!");
        } else {
            students.add(s6);
            ids.add(s6.id);
            System.out.println("Student added successfully");
        }

        // Search student using ID

        System.out.println("\nSEARCH STUDENT");

        int searchId = 103;
        boolean found = false;

        for (Student s : students) {
            if (s.id == searchId) {
                s.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found");
        }

        // Remove student using ID

        System.out.println("REMOVE STUDENT");

        int removeId = 104;

        Iterator<Student> itr = students.iterator();

        while (itr.hasNext()) {
            Student s = itr.next();

            if (s.id == removeId) {
                itr.remove();
                ids.remove(removeId);
                System.out.println("Student " + removeId + " deleted successfully");
                break;
            }
        }

        // Display after deletion

        System.out.println("\nRECORDS AFTER DELETION");

        for (Student s : students) {
            s.display();
        }

        // Find toper using Collections

        Student topper = Collections.max(students,
            Comparator.comparingInt(s -> s.marks));

        System.out.println("TOPPER DETAILS");

        topper.display();
    }
}
