package chap_04;

public class _04_While {
    public static void main(String[] args) {
        int dist = 25;
        int move = 0;
        /*while(move < 25)
        {
            System.out.println("gogo");
            System.out.println("cur "+move);
            move += 4;
        }*/
        move = 0;
        int height = 25;
        do {
            System.out.println("cur" + move);
            move += 3;
        }while(move + height < 25);
    }
}
