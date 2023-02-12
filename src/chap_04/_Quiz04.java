package chap_04;

public class _Quiz04 {
    public static void main(String[] args) {
        boolean light = true;
        boolean disabled = true;
        int time = 5;
        int expense = 4000*time;

        if(expense > 30000)
                expense = 30000;
        if(light || disabled)
                expense /= 2;
        System.out.println("비용 "+expense);


    }
}
