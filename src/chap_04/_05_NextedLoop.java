package chap_04;

public class _05_NextedLoop {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 5 ; i++)
        {
            for(int j = 0 ; j < i ; j++)
                System.out.print("*");
            System.out.println();
        }
        for(int i = 0 ; i < 5; i++)
        {
            for(int j = 0 ; j < 5-i-1 ; j++)
                System.out.print(" ");
            for(int j = 0 ; j < i+1 ; j++)
                System.out.print("*");
            System.out.println();
        }

        for(int i = 2 ; i <= 9 ; i++)
        {
            for(int j = 1 ; j <= 9 ; j++)
                System.out.println(i+" * "+j+" = "+i*j);
        }
    }
}
