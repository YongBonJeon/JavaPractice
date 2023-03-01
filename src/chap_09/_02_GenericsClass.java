package chap_09;

import chap_09.Coffee.*;
import chap_09.user.User;
import chap_09.user.VIPUser;

public class _02_GenericsClass {
    public static void main(String[] args) {
        // 제네릭 클래스

        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("전용본");
        c2.ready();

        System.out.println("-----");

        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("전용근");
        c4.ready();

        System.out.println("-----");

        // 다형성 불가
        int c3Name = (int)c3.name;
        System.out.println(c3Name);
        String c4Name = (String)c4.name;
        System.out.println(c4Name);

        // 컴파일 전 코드 에러 발견 불가
        //c4Name = (String)c3.name;
        System.out.println("-----");

        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();
        Coffee<String> c6 = new Coffee<>("윤미연");
        c6.ready();

        int c5Name = c5.name;
        String c6Name = c6.name;
        System.out.println(c5Name + " " + c6Name);

        System.out.println("-----");

        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("전홍진"));
        c7.ready();

        // User를 상속하는 클래스만 가능하다!
        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VIPUser("전용주"));
        c8.ready();

        System.out.println("-----");
        orderCoffee("김영철");
        orderCoffee("36");

        orderCoffee("김희철","아메리카노");
        orderCoffee(36,"라떼");

    }


    public static <T> void orderCoffee(T name){
        System.out.println("커피 주문 완료 : " + name);
    }

    public static <T,V> void orderCoffee(T name, V coffee){
        System.out.println(coffee + " 주문 완료 : " + name);
    }
}
