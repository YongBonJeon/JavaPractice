package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        int score = 93;

        System.out.println(score);
        System.out.println((double)score);

        score = 93 + (int)98.8;
        System.out.println(score);

        String s1 = String.valueOf(93);
        s1 = Integer.toString(123);
        System.out.println(s1);

        int i = Integer.parseInt("93");
        System.out.println(i);
        double d = Double.parseDouble("93.8");
        System.out.println(d);
    }
}
