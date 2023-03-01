package chap_09;

public class _01_Generics {
    public static void main(String[] args) {
        // 제네릭스
        // wrapper 클래스
        Integer[] iArray = {1,2,3,4,5};
        Double[] dArray = {1.0,2.0,3.0,4.0,5.0};
        String[] sArray = {"A","B","C","D","E"};

        printIntArray(iArray);
        printDoubleArray(dArray);
        printStringArray(sArray);

        System.out.println("-----------");

        // 제네릭스에서는 참조 자료형만 제공
        printAnyArray(iArray);
        printAnyArray(dArray);
        printAnyArray(sArray);
    }

    // T : Type , 다른 글자도 사용 가능하다
    private static <T> void printAnyArray(T[] array){
        for(T t : array){
            System.out.print(t + " ");
        }
        System.out.println();
    }

    private static void printStringArray(String[] sArray) {
        for(String i : sArray){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    private static void printDoubleArray(Double[] dArray) {
        for(double i : dArray){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    private static void printIntArray(Integer[] iArray) {
        for(int i : iArray){
            System.out.print(i+" ");
        }
        System.out.println();
    }

}
