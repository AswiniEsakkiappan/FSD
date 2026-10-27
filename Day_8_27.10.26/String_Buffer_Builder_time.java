package Day_8;

public class String_Buffer_Builder_time {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        StringBuffer sb = new StringBuffer("Face");

        for (int i = 0; i < 100000; i++) {
            sb.append("prep");
        }

        System.out.println("Time taken by StringBuffer: "
                + (System.currentTimeMillis() - startTime) + " ms");

        startTime = System.currentTimeMillis();

        StringBuilder sb2 = new StringBuilder("Face");

        for (int i = 0; i < 100000; i++) {
            sb2.append("prep");
        }

        System.out.println("Time taken by StringBuilder: "
                + (System.currentTimeMillis() - startTime) + " ms");
    }
}
