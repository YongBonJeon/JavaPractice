package chap_08;

import chap_08.reporter.*;
;

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스
        // 추상 클래스 : 미완 <-> 인터페이스 : 껍데기
        Reportable normalReporter = new NormalReporter();
        normalReporter.report();

        Reportable videoReporter = new VideoReporter();
        videoReporter.report();

        Detectable fireDetecter = new FireDetecter();
        fireDetecter.detect();

        Detectable advancedFireDetecter = new AdvancedFireDetecter();
        advancedFireDetecter.detect();

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setReporter(normalReporter);
        factoryCam.setDetecter(fireDetecter);
        factoryCam.detect();
        factoryCam.report();


    }
}
