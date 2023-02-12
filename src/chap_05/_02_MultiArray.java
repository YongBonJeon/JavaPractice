package chap_05;

public class _02_MultiArray {
    public static void main(String[] args) {
        String[][] seats = new String[][] {
                {"A1","A2","A3"},
                {"B1","B2","B3","B4"},
                {"C1","C2","C3","C4","C5"}
        };

        for (String[] seat : seats) {
            for (String s : seat)
                System.out.print(s + " ");
            System.out.println();
        }

        String[][][] marray = new String[3][3][4];

        for(int i = 0 ; i < 3 ; i++)
            for(int j = 0 ; j < 3 ; j++)
                for(int k = 0 ; k < 4 ; k++)
                    marray[i][j][k] = "hi";

        for(String[][] a : marray)
            for(String[] b : a)
                for(String c : b)
                    System.out.println(c);

        String[][] seats2 = new String[10][15];

        for(int i = 0 ; i < 10 ; i++)
            for(int j = 0 ; j < 15 ; j++){
                char x = (char)('A'+i);
                seats2[i][j] = "a" + j;
            }
        for(String[] a : seats2)
            for(String b : a)
                System.out.println(b);


    }
}
