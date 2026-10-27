package Day_8;

import java.lang.*;

public class String_Example{

    public static void main(String[] args) {

        String s = "Face";
        String f = "Face";

        s.concat("Prep");
        System.out.println(s);

        StringBuffer sb = new StringBuffer("Face");
        StringBuffer sb1 = new StringBuffer("Face");
        StringBuffer sb2 = new StringBuffer("Face");

        sb.append("Prep");
        System.out.println(sb);

        if (sb == sb2) {
            System.out.println("Same object");
        } else {
            System.out.println("Different objects");
        }
    }
}
