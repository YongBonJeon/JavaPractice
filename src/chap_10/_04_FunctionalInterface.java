package chap_10;

import chap_10.converter.*;

public class _04_FunctionalInterface {
    public static void main(String[] args) {
        KRWConverter converter = new KRWConverter();
        //converter.convert(2);

        //convertUSD(
        // (USD) -> {System.out.println(USD + "달러 = " + (USD*1400) + "원");}
        // ,2);
        Convertable convertable = (USD) -> {System.out.println(USD + "달러 = " + (USD*1400) + "원");};
        convertUSD(convertable,1);

        // 전달값 x
        ConvertibleWithNoParams c1 = () -> System.out.println("1달러 = 1400원");
        c1.convert();

        // 두 줄 이상 코드
        c1 = () -> {
            int USD = 5;
            int KRW = 1400;
            System.out.println(USD + " 달러 = " + (USD*KRW)+"원");
        };
        c1.convert();

        ConvertibleWithTwoParams c2 = (USD,KRW) -> {
            System.out.println(USD + " 달러 = " + (USD*KRW)+"원");
        };
        c2.convert(10,1400);

        // 반환식 있는 경우
        ConvertibleWithReturn c3 = (USD,KRW) -> {
            return USD*KRW;
        };
        int ret = c3.convert(20,1400);
        System.out.println(ret);
    }

    public static void convertUSD(Convertable converter, int USD){
        converter.convert(USD);

    }
}
