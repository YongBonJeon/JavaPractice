package chap_11;

public class _04_Finally {
    public static void main(String[] args) {
        try {
            System.out.println("택시 탈래");
            //throw new Exception("휴무 택시");
            System.out.println("택시 잘 탔다~");
        } catch(Exception e){
            System.out.println("!! 문제 발생 " + e.getMessage());
        } finally{
            System.out.println("택시 문 닫기");
        }

        // try + catch(s)
        // try + catch(s) + finally
        // try + finally

        try{
            System.out.println(3/0);
        } finally{
            System.out.println("정상 종료");
        }
    }
}
