package chap_08;

import chap_07.BlackBoxRefurbish;

public class _00_AccessModifierTester {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        // public 다른 패키지에서 접근 가능
        b1.modelName = "까망";
        // default 다른 패키지에서 접근 불가능
        //b1.resolution = "UHD";
        // private
        //b1.price = 20000;
        // protected 자식 클래스에서 접근 가능
        //b1.color = "블랙";
    }
}
