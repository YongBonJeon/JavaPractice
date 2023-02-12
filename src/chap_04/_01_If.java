package chap_04;

public class _01_If {
    public static void main(String[] args) {
        int hour = 13;
        if(hour < 14){
            System.out.println("아이스 아메리카노");
            System.out.println("샷 추가");
        }
        System.out.println("hi");

        boolean morningCoffee = true;
        if(hour < 14 && !morningCoffee)
            System.out.println("주문");
        else
            System.out.println("주문 안함");
    }
}
