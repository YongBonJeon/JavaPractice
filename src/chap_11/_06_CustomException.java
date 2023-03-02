package chap_11;

public class _06_CustomException {
    public static void main(String[] args) {
        // 사용자 정의 예외
        int age = 17;
        try{
            if(age < 19){
                //System.out.println("판매 불가");
                // 의도적 예외 발생
                throw new AgeLessThan19Exception("판매 불가");
            }
            else{
                System.out.println("판매 완료");
            }
        } catch(AgeLessThan19Exception e){
            System.out.println("더 나이 먹고 오세요");
        } catch(Exception e){
            System.out.println("모든 예외 처리");
        }
    }
}

class AgeLessThan19Exception extends Exception{
    public AgeLessThan19Exception(String message) {
        super(message);
    }
}
