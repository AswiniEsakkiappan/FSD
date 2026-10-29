package Day_10;

import java.util.*;

public class Arraylist_vs_LinkedList_time  {
    public static void main(String[] args) {
        int n = 100000;

        ArrayList<Integer> al = new ArrayList<>();

        long start = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            al.add(i);
        }

        for (int i = 0; i < n; i++) {
            al.remove(0);
        }

        long end = System.currentTimeMillis();

        System.out.println("ArrayList time: " + (end - start) + " ms");

        LinkedList<Integer> ll = new LinkedList<>();

        start = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            ll.add(i);
        }

        for (int i = 0; i < n; i++) {
            ll.remove(0);
        }

        end = System.currentTimeMillis();

        System.out.println("LinkedList time: " + (end - start) + " ms");
    }
}

