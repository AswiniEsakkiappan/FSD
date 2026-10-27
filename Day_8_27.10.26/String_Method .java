
package Day_8;

import java.lang.*;

public class String_Method {

    public static void main(String[] args) {

        // 1. toUpperCase() and toLowerCase()
    	System.out.println("program 1");
        String s = "Sachin";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s);

        // 2. trim()
;
        System.out.println("program 2");
        String s1 = "  Sachin is a cricket player  ";
        System.out.println(s1);
        System.out.println(s1.trim());

        // 3. startsWith() and endsWith()
        System.out.println("program 3");
        String s2 = "Sachin";
        System.out.println(s2.startsWith("Sa"));
        System.out.println(s2.endsWith("N"));

        // 4. charAt()
        System.out.println("program 4");
        String s3 = "Sachin Ten";
        System.out.println(s3.charAt(0));
        System.out.println(s3.charAt(3));

        // 5. length()
        
        System.out.println("program 5");
        String s4 = "Sachin";
        System.out.println(s4.length());

        // 6. intern()
        System.out.println("program 6");
        String s5 = new String("Sachin");
        String s6 = s5.intern();
        System.out.println(s6);

        // 7. valueOf()
        System.out.println("program 7");
        int a = 10;
        String s7 = String.valueOf(a);
        System.out.println(s7 + 10);

        // 8. replace()
        System.out.println("program 8");
        String s8 = "Java is a programming language. Java is a platform.";
        String replaceString = s8.replace("Java", "Python");
        System.out.println(replaceString);

        // 9. Concatenation using +
        System.out.println("program 9");
        String s9 = "Sachin" + " Tendulkar";
        System.out.println(s9);

        // 10. concat()
        System.out.println("program 10");
        String s10 = "Sachin ";
        String s11 = "Tendulkar";
        String s12 = s10.concat(s11);
        System.out.println(s12);

        // 11. equals() and equalsIgnoreCase()
        System.out.println("program 11");
        String s13 = "Sachin";
        String s14 = new String("Sachin");
        String s15 = "Saurav";

        System.out.println(s13.equals(s14));
        System.out.println(s13.equals(s15));
        System.out.println(s13.equalsIgnoreCase("SACHIN"));

        // 12. == operator
        System.out.println("program 12");
        String s16 = "Sachin";
        String s17 = "Sachin";
        String s18 = new String("Sachin");

        System.out.println(s16 == s17);
        System.out.println(s16 == s18);

        // 13. compareTo()
        System.out.println("program 13");
        String s19 = "Sachin";
        String s20 = "Sachin";
        String s21 = "Ratan";

        System.out.println(s19.compareTo(s20));
        System.out.println(s19.compareTo(s21));
        System.out.println(s21.compareTo(s19));

        // 14. replaceAll()
        System.out.println("program 14");
        String s22 = "java by Edubridge is a very good E-Learning Platform";
        String replaceAllString = s22.replaceAll("a", "e");
        System.out.println(replaceAllString);

        // 15. split()
        System.out.println("program 15");
        String s23 = "java string split method by javatpoint";
        String[] words = s23.split("\\s");

        for (String w : words) {
            System.out.println(w);
        }

        // 16. split() with limit 0
        System.out.println("program 16");
        String s24 = "welcome to split world";

        System.out.println("Returning words with limit 0:");
        for (String w : s24.split("\\s", 0)) {
            System.out.println(w);
        }

        // 17. split() with limit 1
        System.out.println("program 17");
        System.out.println("Returning words with limit 1:");
        for (String w : s24.split("\\s", 1)) {
            System.out.println(w);
        }

        // 18. split() with limit 2
        System.out.println("program 18");
        System.out.println("Returning words with limit 2:");
        for (String w : s24.split("\\s", 2)) {
            System.out.println(w);
        }
    }
}
