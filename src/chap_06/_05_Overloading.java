package chap_06;

public class _05_Overloading {
    public static int getPower(int number){
        return number*number;
    }

    public static int getPower(String strNumber){
        int number = Integer.parseInt(strNumber);
        return number*number;
    }
    public static int getPower(int x, int y){
        int result = 1;
        for(int i = 0 ; i < y ; i++)
            result *= x;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getPower(3));
        System.out.println(getPower("3"));
        System.out.println(getPower(3,4));
    }
}
