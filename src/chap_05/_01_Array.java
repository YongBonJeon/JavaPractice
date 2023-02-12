package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        String[] coffees = new String[4];
        /*String coffees[] = new String[4];*/

         coffees[0] = "ice";
         coffees[1] = "hot";
         coffees[2] = "latte";
         coffees[3] = "americano";

        for (String coffee : coffees)
            System.out.println(coffee);

        String[] names = {"아메리카노", "카페모카", "라떼"};
        for(String name : names)
            System.out.println(name);

    }
}
