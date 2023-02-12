package chap_07;

public class BlackBox {
    String modelName;
    String resolution;
    int price;
    String color;

    static boolean canAutoReport = false;

    void autoReport(){
        if(canAutoReport)
            System.out.println("Auto Report!");
        else
            System.out.println("No");
    }

    void insertMemoryCard(int capacity){
        System.out.println("insert!");
        System.out.println("용량 " + capacity);
    }
}
