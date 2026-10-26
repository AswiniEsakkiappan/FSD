package Day_3;


import java.util.Scanner;

public class RelationalOperator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value:");
        int a = sc.nextInt();

        System.out.println("Enter a value:");
        int b = sc.nextInt();

        RelationalOp c = new RelationalOp();

        c.equal(a, b);
        c.notequal(a, b);
        c.greater(a, b);
        c.smaller(a, b);
        c.greaterequal(a, b);
        c.smallerequal(a, b);

        sc.close();
    }
}

class RelationalOp {

    public void equal(int a, int b) {
        if (a == b) {
            System.out.println(a + "==" + b + ":True");
        } else {
            System.out.println(a + "==" + b + ":False");
        }
    }

    public void notequal(int a, int b) {
        if (a != b) {
            System.out.println(a + "!=" + b + ":True");
        } else {
            System.out.println(a + "!=" + b + ":False");
        }
    }

    public void greater(int a, int b) {
        if (a > b) {
            System.out.println(a + ">" + b + ":True");
        } else {
            System.out.println(a + ">" + b + ":False");
        }
    }

    public void smaller(int a, int b) {
        if (a < b) {
            System.out.println(a + "<" + b + ":True");
        } else {
            System.out.println(a + "<" + b + ":False");
        }
    }

    public void greaterequal(int a, int b) {
        if (a >= b) {
            System.out.println(a + ">=" + b + ":True");
        } else {
            System.out.println(a + ">=" + b + ":False");
        }
    }

    public void smallerequal(int a, int b) {
        if (a <= b) {
            System.out.println(a + "<=" + b + ":True");
        } else {
            System.out.println(a + "<=" + b + ":False");
        }
    }
}
