package Day_10;


import java.util.*;

public class Tree_set{
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(30);
        set.add(10);
        set.add(20);
        set.add(40);
        set.add(10);

        System.out.println("TreeSet elements: " + set);
        System.out.println("Size: " + set.size());

        System.out.println("Contains 20: " + set.contains(20));

        System.out.println("First element: " + set.first());
        System.out.println("Last element: " + set.last());

        System.out.println("Adding duplicate 10: " + set.add(10));

        System.out.println("Adding null:");
        try {
            set.add(null);
        } catch (NullPointerException e) {
            System.out.println("Null is not allowed");
        }

        System.out.println("Final TreeSet: " + set);
    }
}
