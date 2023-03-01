package chap_11;

public class _03_Throw {
    public static void main(String[] args) {
        int age = 17;
        try{
            if(age < 19){
                //System.out.println("판매 불가");
                // 의도적 예외 발생
                throw new Exception("판매 불가");
            }
            else{
                System.out.println("판매 완료");
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
