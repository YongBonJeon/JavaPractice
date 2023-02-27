package chap_07;

public class _13_MethodOverriding {
    public static void main(String[] args) {
        // 자식 클래스에서 부모 클레스 덮어쓰기 (재정의)

        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();
    }
}
