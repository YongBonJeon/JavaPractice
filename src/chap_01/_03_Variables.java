package chap_01;

import java.sql.SQLOutput;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "이름";
        int hour = 15;

        System.out.println(name + hour + "h123");

        double score = 90.5;
        char grade = 'x';

        System.out.println(score + " " + grade);

        boolean pass = true;

        System.out.println(pass + "hi123");

        double d = 3.1412345678;
        float f = 3.1412345678f;

        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000L;
        l = 1_000_000_000_000L;
        System.out.println(l);

        /* int long float double char string boolean */

    }
}
