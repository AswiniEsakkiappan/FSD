package Day_8;

public class String_Buffer_Methods {

    public static void main(String[] args) {

        // 1. append()
        StringBuilder sb = new StringBuilder("Hello ");
        sb.append("Java");
        System.out.println(sb);

        // 2. insert()
        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.insert(1, "Java");
        System.out.println(sb1);

        // 3. replace()
        StringBuilder sb2 = new StringBuilder("Hello");
        sb2.replace(1, 3, "Java");
        System.out.println(sb2);

        // 4. delete()
        StringBuilder sb3 = new StringBuilder("Hello");
        sb3.delete(1, 3);
        System.out.println(sb3);

        // 5. reverse()
        StringBuilder sb4 = new StringBuilder("Hello");
        sb4.reverse();
        System.out.println(sb4);

        // 6. length()
        StringBuilder sb5 = new StringBuilder("Hello");
        System.out.println(sb5.length());

        // 7. capacity()
        StringBuilder sb6 = new StringBuilder("Hello");
        System.out.println(sb6.capacity());

        // 8. charAt()
        StringBuilder sb7 = new StringBuilder("Hello");
        System.out.println(sb7.charAt(1));

        // 9. setCharAt()
        StringBuilder sb8 = new StringBuilder("Hello");
        sb8.setCharAt(0, 'Y');
        System.out.println(sb8);

        // 10. deleteCharAt()
        StringBuilder sb9 = new StringBuilder("Hello");
        sb9.deleteCharAt(1);
        System.out.println(sb9);
    }
}
