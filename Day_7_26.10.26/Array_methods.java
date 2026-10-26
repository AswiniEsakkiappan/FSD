package Day_7;


import java.util.Arrays;

public class Array_methods {
    public static void main(String[] args) {

        // Task 1: Arrays.toString()
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Task 1: " + Arrays.toString(arr));

        // Task 2: Arrays.sort()
        int[] arr2 = {50, 10, 40, 20, 30};
        Arrays.sort(arr2);
        System.out.println("Task 2: " + Arrays.toString(arr2));

        // Task 3: Arrays.binarySearch()
        int index = Arrays.binarySearch(arr, 30);
        System.out.println("Task 3: Index: " + index);

        // Task 4: Arrays.equals()
        int[] a = {10, 20, 30};
        int[] b = {10, 20, 30};
        System.out.println("Task 4: " + Arrays.equals(a, b));

        // Task 5: Arrays.copyOf()
        int[] copy = Arrays.copyOf(arr, 3);
        System.out.println("Task 5: " + Arrays.toString(copy));

        // Task 6: Arrays.fill()
        int[] arr3 = new int[5];
        Arrays.fill(arr3, 100);
        System.out.println("Task 6: " + Arrays.toString(arr3));

        // Task 7: Arrays.stream().sum()
        int sum = Arrays.stream(arr).sum();
        System.out.println("Task 7: Sum: " + sum);

        // Task 8: Maximum and Minimum
        int[] arr4 = {45, 12, 78, 23, 9};
        int max = Arrays.stream(arr4).max().getAsInt();
        int min = Arrays.stream(arr4).min().getAsInt();
        System.out.println("Task 8: Maximum: " + max);
        System.out.println("Task 8: Minimum: " + min);

        // Task 9: Arrays.mismatch()
        int[] c = {10, 20, 30, 40};
        int[] d = {10, 20, 35, 40};
        System.out.println("Task 9: " + Arrays.mismatch(c, d));

        // Task 10: Arrays.compare()
        int[] e = {10, 20, 30};
        int[] f = {10, 20, 40};
        int result = Arrays.compare(e, f);
        System.out.println("Task 10: " + result);
    }
}
