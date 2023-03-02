package chap_13;

public class _02_Output {
    public static void main(String[] args) {
        // System.out.format()
        // System.out.printf()

        System.out.printf("%d\n",5);
        System.out.printf("%d %d %d\n",1,2,3);
        System.out.printf("%6d\n",123);
        System.out.printf("%06d\n",123);
        System.out.printf("%+d\n",-123);
        System.out.printf("%,15d\n",1000000000);

        System.out.println("-----");
        System.out.printf("%f\n",Math.PI);
        System.out.printf("%.2f\n",Math.PI);

        System.out.println("-----");
        System.out.printf("%s\n","Java");
    }
}
