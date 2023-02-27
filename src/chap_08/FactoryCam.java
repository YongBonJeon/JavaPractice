package chap_08;

import chap_08.reporter.Detectable;
import chap_08.reporter.Reportable;

public class FactoryCam extends Camera implements Detectable, Reportable {
    private Detectable detecter;
    private Reportable reporter;

    public void setDetecter(Detectable detecter) {
        this.detecter = detecter;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    @Override
    public void showMainFeature(){
        System.out.println("화재 감지");
    }


    @Override
    public void detect() {
        detecter.detect();
    }

    @Override
    public void report() {
        reporter.report();
    }
}
