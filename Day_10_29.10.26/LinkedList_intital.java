package Day_10;

import java.util.*;


public class LinkedList_intital{
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        long start = System.currentTimeMillis();

        ll.add("Apple");
        ll.add("Banana");
        ll.add("Mango");
        ll.add("Orange");

        System.out.println("LinkedList: " + ll);

        ll.remove("Banana");
        ll.remove(0);

        System.out.println("After removing: " + ll);

        ll.addFirst("Grapes");
        ll.addLast("Pineapple");

        System.out.println("Updated LinkedList: " + ll);

        System.out.println("First element: " + ll.get(0));
        System.out.println("Size: " + ll.size());

        long end = System.currentTimeMillis();

        System.out.println("Time taken: " + (end - start) + " ms");
    }
}
