package chap_10;

import com.sun.xml.internal.ws.api.ComponentFeature;

public class _01_AnonymousClass1 {
    public static void main(String[] args) {
        // 익명 클래스 : 이름이 없는 클래스

        Coffee c1 = new Coffee();
        c1.order("아메리카노");

        Coffee c2 = new Coffee();
        c1.order("라떼");

        // 객체 하나만을 위한 메소드 재정의
        Coffee specialCoffee = new Coffee(){
            @Override
            public void order(String coffee) {
                super.order(coffee);
                System.out.println("케이크는 서비스입니다");
            }

            @Override
            public void returnTray() {
                System.out.println("제가 치울게요");
            }
        };
        specialCoffee.order("바닐라 라떼");
        specialCoffee.returnTray();
    }
}

class Coffee{
    public void order(String coffee){
        System.out.println("주문하신 + coffee");
    }

    public void returnTray(){
        System.out.println("커피 반납이 완료되었습니다");
    }
}
