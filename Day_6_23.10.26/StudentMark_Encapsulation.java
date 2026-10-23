package Day_6;

public class StudentMark {
    public static void main(String[] args) {
        Student s = new Student();

        s.setStudentId(101);
        s.setStudentName("Arun");
        s.setMarks(85);

        System.out.println("Student ID: " + s.getStudentId());
        System.out.println("Student Name: " + s.getStudentName());
        System.out.println("Marks: " + s.getMarks());

        s.setMarks(120);
    }
}

class Student {
    private int studentId=101;
    private String studentName="Aswini";
    private int marks=33;

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks! Enter marks between 0 and 100.");
        }
    }

    public int getMarks() {
        return marks;
    }
}
