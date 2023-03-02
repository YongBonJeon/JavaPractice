package chap_13;

import java.util.Scanner;

public class _01_Input {
    public static void main(String[] args) {
        // 사용자 입력
        Scanner sc = new Scanner(System.in);
        /*System.out.println("이름 입력");
        String name = sc.next();
        String bloodType = sc.next();
        int height = sc.nextInt();
        double weight = sc.nextDouble();

        System.out.println("이름 : " + name);
        System.out.println("혈액형 : " + bloodType);
        System.out.println("나이 : " + height);
        System.out.println("무게 : " + weight);*/

        System.out.println("뭐 배움?");
        String lang = sc.next();
        //String lang = sc.nextLine();
        System.out.println("언어 : " + lang);

        sc.nextLine();

        System.out.println("기분 어떰");
        String feeling = sc.next();
        //String feeling = sc.nextLine();
        System.out.println("기분 : " + feeling);
    }
}
