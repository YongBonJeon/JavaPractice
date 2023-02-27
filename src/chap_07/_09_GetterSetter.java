package chap_07;

public class _09_GetterSetter {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망";
        //b1.resolution = "FHD";
        b1.price = 20000;
        b1.color = "블랙";

        //b1.price = -5000;
        //System.out.println(b1.price);

        BlackBox b2 = new BlackBox();
        b2.setModelName("하양");
        b2.setPrice(-5000);
        b2.setColor("화이트");

        System.out.println(b2.getPrice());
        System.out.println(b2.getResolution());
    }
}
