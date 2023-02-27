package chap_07;

public class Camera {
    public String name;

    public Camera() {
        this.name = "카메라";
    }

    protected Camera(String name){
        this.name = name;
    }

    public void takePicture(){
        System.out.println(name + " 사진 촬영");
    }

    public void recordVideo(){
        System.out.println(name + " 동영상 녹화");
    }

    public void showMainFeature(){
        System.out.println(name + "주요 기능, 촬영, 녹화");
    }
}
