package chap_07;

//import jdk.nashorn.internal.runtime.regexp.JoniRegExp;

public class _12_Inheritance {
    public static void main(String[] args) {
        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        camera.takePicture();
        factoryCam.recordVideo();
        speedCam.takePicture();

        factoryCam.detect();
        speedCam.checkSpeed();
        speedCam.recognize();
    }
}
