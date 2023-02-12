package chap_04;

public class _02_SwitchCase {
    public static void main(String[] args) {
        int ranking = 2;

        switch(ranking)
        {
            case 1 :
                System.out.println("1등");
                break;
            case 2:
            case 3:
                System.out.println("2등과 3등");
                break;
            default :
                System.out.println("탈락");
                break;
        }
    }
}
