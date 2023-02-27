package chap_07;

import java.util.Random;

public class _11_Package {
    public static void main(String[] args) {
        // 패키지 (랜덤 클래스)

        Random random = new Random();

        System.out.println(random.nextInt());
        System.out.println(random.nextInt(10));

        System.out.println(random.nextDouble());
        System.out.println(5+5* random.nextDouble());

        System.out.println(random.nextBoolean());

    }
}
