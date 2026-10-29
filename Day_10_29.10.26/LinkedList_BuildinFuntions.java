package Day_10;

import java.util.*;

public class LinkedList_BuildinFuntions {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("Apple");
        ll.add("Banana");
        ll.add("Mango");
        ll.add(1, "Orange");

        ll.addFirst("Grapes");
        ll.addLast("Kiwi");

        System.out.println("List: " + ll);
        System.out.println("First: " + ll.getFirst());
        System.out.println("Last: " + ll.getLast());
        System.out.println("Get: " + ll.get(0));

        ll.set(0, "Pineapple");
        System.out.println("Set: " + ll);

        System.out.println("Contains: " + ll.contains("Mango"));
        System.out.println("Index: " + ll.indexOf("Mango"));
        System.out.println("Last index: " + ll.lastIndexOf("Mango"));
        System.out.println("Size: " + ll.size());

        ll.remove("Banana");
        ll.remove(0);
        ll.removeFirst();
        ll.removeLast();

        System.out.println("After remove: " + ll);

        ll.add("Apple");
        ll.add("Apple");
        ll.removeFirstOccurrence("Apple");
        ll.removeLastOccurrence("Apple");

        ll.offer("Orange");
        ll.offerFirst("Grapes");
        ll.offerLast("Kiwi");

        System.out.println("Peek: " + ll.peek());
        System.out.println("Peek first: " + ll.peekFirst());
        System.out.println("Peek last: " + ll.peekLast());

        System.out.println("Poll: " + ll.poll());
        System.out.println("Poll first: " + ll.pollFirst());
        System.out.println("Poll last: " + ll.pollLast());

        ll.push("Mango");
        System.out.println("Push: " + ll);
        System.out.println("Pop: " + ll.pop());

        System.out.println("Reverse order:");
        Iterator<String> it = ll.descendingIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        ll.sort(null);
        System.out.println("Sorted: " + ll);

        System.out.println("Sublist: " +
            ll.subList(0, Math.min(2, ll.size())));

        Object[] arr = ll.toArray();
        System.out.println("Array: " + Arrays.toString(arr));

        ll.clear();
        System.out.println("Cleared: " + ll);
    }
}
