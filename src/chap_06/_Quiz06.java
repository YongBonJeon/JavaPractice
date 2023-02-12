package chap_06;

public class _Quiz06 {
    public static String getHiddenData(String x, int y){
        String hiddenData = x.substring(0,y);

        for(int i = 0 ; i < x.length()-y ; i++)
            hiddenData += "*";
        return hiddenData;
    }
    public static void main(String[] args) {
        String name = "나코딩";
        String id = "990130-1234567";
        String phone = "010-1234-5678";

        System.out.println("이름 " + getHiddenData(name,1));
        System.out.println("주민등록번호 " + getHiddenData(id,8));
        System.out.println("전화번호 " + getHiddenData(phone,9));
    }
}
