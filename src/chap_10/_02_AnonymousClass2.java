package chap_10;



public class _02_AnonymousClass2 {
    public static void main(String[] args) {
        HomeMadeBurger momMadeBurger = getMomMadeBurger();
        momMadeBurger.cook();
        System.out.println("-----");

        // 상속해서 새로운 클래스를 만드는 것이 아닌 일회성 오버라이딩
        HomeMadeBurger broMadeBurger = getBroMadeBurger();
        broMadeBurger.cook();
    }

    private static HomeMadeBurger getBroMadeBurger() {
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 동생 버거");
                System.out.println("재료 : 빵, 치킨패티, 잼");
            }
        };
    }

    public static HomeMadeBurger getMomMadeBurger() {
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 수제버거");
                System.out.println("재료 : 빵, 패티, 해시브라운");
            }
        };
    }
}

abstract class HomeMadeBurger{
    public abstract void cook();
}
