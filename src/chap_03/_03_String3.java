package chap_03;

public class _03_String3 {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo("Java"));
        System.out.println(s1.equalsIgnoreCase("java"));

        System.out.println(s1 == "Java");

        // 같은 메모리 공간 참조
        s1 = "1234";
        s2 = "1234";

        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        // 다른 메모리 공간
        s1 = new String("1234");
        s2 = new String("1234");

        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
    }
}
