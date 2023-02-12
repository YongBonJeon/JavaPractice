package chap_05;

public class _03_ASCII {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println((char)(c+1));

        String[][] seats = new String[10][15];
        char ch = 'A';
        for(int i = 0 ; i < 10 ; i++)
        {
            for(int j = 0 ; j < 15 ; j++)
            {
                seats[i][j] = String.valueOf((char)(ch+i))+j;
            }
        }
        for(String[] a : seats) {
            for (String b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
