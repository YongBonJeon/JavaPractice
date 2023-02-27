package chap_08.reporter;

public class AdvancedFireDetecter implements Detectable{
    @Override
    public void detect() {
        System.out.println("좋은 성능으로 화재를 감지합니다");
    }
}
