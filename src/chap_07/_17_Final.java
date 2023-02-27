package chap_07;

public class _17_Final {
    public static void main(String[] args) {
        // Final : 1. 상수
        ActionCam actionCam = new ActionCam();
//        actionCam.lens = "표준렌즈";
        actionCam.recordVideo();
        actionCam.makeVideo();

        /*SlowActionCam slowActionCam = new SlowActionCam();
        slowActionCam.recordVideo();
        slowActionCam.makeVideo();*/

    }
}
