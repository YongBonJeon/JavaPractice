package chap_07;

public class SpeedCam extends Camera{

    public SpeedCam() {
        //this.name = "과속단속 카메라";
        super("과속단속 카메라");
    }

    public void checkSpeed(){
        System.out.println("속도 측정");
    }

    public void recognize(){
        System.out.println("recognzie");
    }

    @Override
    public void showMainFeature(){
        System.out.println(name + "주요 기능, 측정, 감지");
    }

}