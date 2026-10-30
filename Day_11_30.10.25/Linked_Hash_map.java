package Day_11;

import java.util.*;

class Linked_Hash_map  {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        map.put(3, "Apple");
        map.put(1, "Mango");
        map.put(2, "Orange");
        map.put(1, "Grapes");
        map.put(4, "Apple");
        map.put(null, "Banana");
        map.put(5, null);

        System.out.println("LinkedHashMap: " + map);

        System.out.println("Duplicate key 1: " + map.get(1));
        System.out.println("Check key 2: " + map.containsKey(2));
        System.out.println("Check value Apple: " + map.containsValue("Apple"));

        map.remove(3);

        System.out.println("After removal: " + map);
    }
}
