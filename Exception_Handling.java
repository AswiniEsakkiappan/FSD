package Day_9;


public class Exception_Handling{
    public static void main(String[] args) {

        try {
            int a = 50 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Cannot divide by zero");
        }

        try {
            String s = null;
            System.out.println(s.length());
        }
        catch (NullPointerException e) {
            System.out.println("Null Pointer Exception: Null value");
        }

        try {
            int n = Integer.parseInt("abc");
        }
        catch (NumberFormatException e) {
            System.out.println("Number Format Exception: Invalid number");
        }

        try {
            int arr[] = new int[5];
            arr[10] = 50;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception: Invalid index");
        }

        try {
            String s = "Java";
            System.out.println(s.charAt(10));
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("String Index Exception: Invalid position");
        }

        System.out.println("Program continues...");
    }
}
