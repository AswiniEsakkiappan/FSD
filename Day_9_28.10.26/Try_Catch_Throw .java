package Day_9;
import java.util.*;
public class Try_Catch_Throw {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            if (age < 18) {
                throw new ArithmeticException("Not eligible to vote");
            }

            System.out.println("Eligible to vote");
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Finally block executed");
            sc.close();
        }
    }
}
