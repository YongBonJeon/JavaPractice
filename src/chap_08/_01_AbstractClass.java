package chap_08;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화
        // 추상 클래스 : 미완의 클래스
        // 추상 메소드 : 껍데기만 존재
        // 자식 클래스에서 완성 후 사용

        // 추상적이면 안 만들어진다?
//        Camera camera = new Camera();
//        FactoryCam factoryCam = new FactoryCam();
        Camera factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();
    }
}
