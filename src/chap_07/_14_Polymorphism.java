package chap_07;

public class _14_Polymorphism {
    public static void main(String[] args) {


        // class Person : 사람
        // class Student extends Person : 학생은 사람이다.
        // class Teacher extends Person : 선생은 사람이다.

        Camera camera = new Camera();
        Camera factoryCam = new FactoryCam();
        Camera speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for(Camera c : cameras)
            c.showMainFeature();

        // 부모 클래스의 메소드만 사용 가능한 상태

        if(camera instanceof Camera)
            System.out.println("카메라입니다");

        if(factoryCam instanceof FactoryCam)
            ((FactoryCam)factoryCam).detect();

        if(speedCam instanceof SpeedCam)
            ((SpeedCam)speedCam).checkSpeed();

        Object[] cams = new Object[3];
        cams[0] = new Camera();
        cams[1] = new FactoryCam();
    }
}
