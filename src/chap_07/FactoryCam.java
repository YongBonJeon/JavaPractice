package chap_07;

public class FactoryCam extends Camera{

    public FactoryCam() {
        //this.name = "공장 카메라";
        super("공장 카메라");
    }

    public void takePicture(){
        super.takePicture();
        System.out.println("hih");
    }

    public void detect(){
        System.out.println("화재 감지");
    }

    public void showMainFeature(){
        System.out.println(name + "주요 기능, 화재 감지");
    }
}
