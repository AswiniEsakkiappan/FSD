package Day_10;

import java.util.*;

public class ArrayList_Initial {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        long start = System.currentTimeMillis();

        al.add("Apple");
        al.add("Banana");
        al.add("Mango");
        al.add("Orange");

        System.out.println("ArrayList: " + al);

        al.remove("Banana");
        al.remove(0);

        System.out.println("After removing: " + al);

        System.out.println("First element: " + al.get(0));
        System.out.println("Size: " + al.size());

        long end = System.currentTimeMillis();

        System.out.println("Time taken: " + (end - start) + " ms");
    }
}
