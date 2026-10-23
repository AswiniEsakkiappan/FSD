package Day_2;

import java.util.Scanner;

public class EvenNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i+" ");
            }
        }

        sc.close();
    }
}
