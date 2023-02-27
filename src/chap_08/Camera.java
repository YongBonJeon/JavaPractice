package chap_08;

public abstract class Camera {
    public void takePicture(){
        System.out.println("사진 촬영");
    }
    public void recordVideo(){
        System.out.println("동영상 녹화");
    }

    // 추상 메소드는 바디 없어도 된다
    // 자식 클래스에서 구현해라!
    public abstract void showMainFeature();
}
