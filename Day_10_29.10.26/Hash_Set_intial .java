package Day_10;

import java.util.*;

public class Hash_Set_intial {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(30);
        set.add(10);
        set.add(20);
        set.add(40);
        set.add(10);
        set.add(null);
        set.add(null);

        System.out.println("HashSet elements: " + set);
        System.out.println("Size: " + set.size());

        System.out.println("Contains 20: " + set.contains(20));
        System.out.println("Contains null: " + set.contains(null));

        System.out.println("Sorted elements:");
        TreeSet<Integer> sorted = new TreeSet<>(set);
        System.out.println(sorted);
    }
}
