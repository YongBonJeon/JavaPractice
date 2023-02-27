package chap_07;

public class _05_MethodOverloading {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망";

        b1.record(false,false,10);
        b1.record(true,false,3);
        b1.record();

        String x = "BlackBox";
        System.out.println(x.indexOf("k"));
    }
}
