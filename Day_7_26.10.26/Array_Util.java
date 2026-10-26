package Day_7;

import java.util.Arrays;
import java.util.ArrayList;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public class Array_Util {

    public static void main(String[] args) {

        // 1. Print an array
        int[] intArray = {1, 2, 3, 4, 5};

        String intArrayString = Arrays.toString(intArray);

        System.out.println(intArray);
        System.out.println(intArrayString);


        // 2. Create an ArrayList from an array
        String[] stringArray = {"a", "b", "c", "d", "e"};

        ArrayList<String> arrayList =
                new ArrayList<String>(Arrays.asList(stringArray));

        System.out.println(arrayList);


        // 3. Check whether an array contains a value
        String[] stringArray2 = {"abc", "bcd", "cba", "dcb", "efg"};

        boolean b = Arrays.asList(stringArray2).contains("abc");

        System.out.println(b);


        // 4. Concatenate two arrays
        int[] intArray2 = {6, 7, 8, 9, 10};

        int[] a = ArrayUtils.addAll(intArray, intArray2);

        String s = Arrays.toString(a);

        System.out.println(s);


        // 6. Join array elements into a single String
        String j = StringUtils.join(
                new String[]{"a", "b", "c"}, ", ");

        System.out.println(j);


        // 9. Reverse an array
        int[] reverseArray = {1, 2, 3, 4, 5};

        ArrayUtils.reverse(reverseArray);

        System.out.println(Arrays.toString(reverseArray));


        // 10. Remove an element from an array
        int[] removeArray = {1, 2, 3, 4, 5};

        int[] removed = ArrayUtils.removeElement(removeArray, 3);

        System.out.println(Arrays.toString(removed));
    }
}

