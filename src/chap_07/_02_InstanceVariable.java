package chap_07;

public class _02_InstanceVariable {
    public static void main(String[] args) {

        BlackBox b1 = new BlackBox();
        b1.modelName = "까망";
        b1.resolution = "FHD";
        b1.price = 20000;
        b1.color = "블랙";

        System.out.println(b1.modelName);
        System.out.println(b1.resolution);
        System.out.println(b1.price);
        System.out.println(b1.color);

        BlackBox b2 = new BlackBox();
        b1.modelName = "하양";
        b1.resolution = "UHD";
        b1.price = 10000;
        b1.color = "화이트";
    }
}
