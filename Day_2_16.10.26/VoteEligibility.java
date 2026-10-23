package Day_2;

import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Invalid age");
        } else if (age < 18) {
            System.out.println("Not eligible to vote");
        } else if (age >= 18) {
            System.out.println("Eligible to vote");
        }

        sc.close();
    }
}
