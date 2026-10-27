package Day_8;

import java.util.Scanner;

public class UsernameValidator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String username = sc.nextLine();

        int length = username.length();
        boolean spaces = username.contains(" ");

        System.out.println("Username: " + username);
        System.out.println("Length: " + length);
        System.out.println("Contains spaces: " + (spaces ? "Yes" : "No"));

        if (length >= 5 && !spaces) {
            System.out.println("Username status: Valid");
        } else {
            System.out.println("Username status: Invalid");
        }

        sc.close();
    }
}
