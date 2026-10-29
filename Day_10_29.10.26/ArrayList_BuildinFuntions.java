package Day_10;

import java.util.*;

public class ArrayList_BuildinFuntions {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("Apple");
        al.add("Banana");
        al.add("Mango");
        al.add(1, "Orange");

        System.out.println("List: " + al);
        System.out.println("Get: " + al.get(0));

        al.set(0, "Grapes");
        System.out.println("Set: " + al);

        System.out.println("Contains: " + al.contains("Mango"));
        System.out.println("Index: " + al.indexOf("Mango"));
        System.out.println("Last index: " + al.lastIndexOf("Mango"));
        System.out.println("Size: " + al.size());
        System.out.println("Empty: " + al.isEmpty());

        al.remove("Banana");
        al.remove(0);
        System.out.println("After remove: " + al);

        al.addAll(Arrays.asList("Kiwi", "Orange"));
        System.out.println("Add all: " + al);

        al.removeAll(Arrays.asList("Kiwi"));
        System.out.println("Remove all: " + al);

        al.retainAll(Arrays.asList("Mango", "Orange"));
        System.out.println("Retain all: " + al);

        al.add("Apple");
        al.removeIf(s -> s.startsWith("A"));
        System.out.println("Remove if: " + al);

        al.add("Banana");
        al.replaceAll(s -> s.toUpperCase());
        System.out.println("Replace all: " + al);

        al.sort(null);
        System.out.println("Sorted: " + al);

        System.out.println("Sublist: " +
            al.subList(0, Math.min(2, al.size())));

        for (String s : al) {
            System.out.println(s);
        }

        Iterator<String> it = al.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Object[] arr = al.toArray();
        System.out.println("Array: " + Arrays.toString(arr));

        al.clear();
        System.out.println("Cleared: " + al);
    }
}
