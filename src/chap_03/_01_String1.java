package chap_03;

import java.util.Locale;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and C and python";
        System.out.println(s);

        // 문자열 길이
        System.out.println(s.length());

        System.out.println(s.toUpperCase());
        System.out.println(s);

        System.out.println(s.contains("Java"));
        System.out.println(s.indexOf("Java"));
        System.out.println(s.indexOf("C#"));
        System.out.println(s.indexOf("and"));
        System.out.println(s.lastIndexOf("and"));
        System.out.println(s.startsWith("I like"));
        System.out.println(s.endsWith("python"));
    }
}
