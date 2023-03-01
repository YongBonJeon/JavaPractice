package chap_11;

public class _02_Catch {
    public static void main(String[] args) {
        try{
            //System.out.println(3/0);
            //int[] arr = new int[3];
            //arr[5] = 1;
            //Object obj = "test";
            //System.out.println((int)obj);

            String s = null;
            System.out.println(s.toLowerCase());

        } catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("뭔가 잘못 했어");
        } /*catch(ArrayIndexOutOfBoundsException e){
            System.out.println("인덱스 잚못 했어");
        }*/ catch(ClassCastException e){
            System.out.println("형변환 잘못 했어");
        }
        catch(Exception e){
            System.out.println("문제 발생 : " +e.getMessage());
            e.printStackTrace();
        }

        System.out.println("정상 종료");
    }
}
