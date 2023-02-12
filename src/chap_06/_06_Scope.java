package chap_06;

public class _06_Scope {
    public static void methodA(){
        int number = 5;
        System.out.println(number);
    }

    public static void methodB(){
        int result = 1;
    }

    public static void main(String[] args) {
        int number = 3;
        System.out.println(number);

        {
            int j = 0;
            System.out.println(j+4);
        }


    }
}
