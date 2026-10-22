
package Day_5;

public class Staticword {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.display();
        s2.display();

        Student.show();

        // Cannot access a non-static method
        
        // Student.normal();

        // Cannot use 'this' in a static method
        // Student.test();
    }
}

class Student {

    static int count = 0;
    int id = 101;

    Student() {
        count++;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Student count: " + count);
    }

    static void show() {
        System.out.println("This is a static method");
        System.out.println("Count: " + count);

        //  Cannot directly access a non-static variable
        // System.out.println(id);

        //  Cannot use this in a static method
        // System.out.println(this.id);
    }

    void normal() {
        System.out.println("This is a non-static method");
    }
}
