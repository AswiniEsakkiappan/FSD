package Day_10;

import java.util.*;

public class ArrayList_Iteration {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");

        System.out.println("1. Iterator:");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("2. For-each loop:");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("3. ListIterator:");
        ListIterator<String> li = list.listIterator();
        while (li.hasNext()) {
            System.out.println(li.next());
        }

        System.out.println("4. For loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("5. forEach():");
        list.forEach(s -> System.out.println(s));

        System.out.println("6. forEachRemaining():");
        Iterator<String> it2 = list.iterator();
        it2.forEachRemaining(s -> System.out.println(s));
    }
}
