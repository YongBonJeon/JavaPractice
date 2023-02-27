package chap_07;

public class _10_AccessModifier {
    public static void main(String[] args) {
        // 캡슐화 encapsulation
        // 정보은닉 Information hiding

        // private
        // public
        // default
        // protected

        BlackBoxRefurbish b2 = new BlackBoxRefurbish();
        b2.setModelName("하양");
        b2.setPrice(-5000);
        b2.setColor("화이트");

        // private
        //b2.price = -5000;

        System.out.println(b2.getPrice());
        System.out.println(b2.getResolution());
    }
}
