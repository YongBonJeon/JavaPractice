package chap_07;

// 상속 불가
public class ActionCam extends Camera{
    // 값 변경 불가 (접근과 상관x)
    // 생성자에서 초기화 가능
    public final String lens;// = "광각렌즈";
    public ActionCam() {
        super("액션 카메라");
        lens = "광각렌즈";
    }

    // 메소드 오버라이딩 불가
    public final void makeVideo(){
        System.out.println(this.name + " : " + this.lens + " 멋진 비디오 제작");
    }
}
