package chap_07;

public class _03_ClassVariables {
    public static void main(String[] args) {

        BlackBox b1 = new BlackBox();
        b1.modelName = "κΉλ§";
        BlackBox b2 = new BlackBox();
        b2.modelName = "νμ";

        System.out.println(b1.modelName + " " + b1.canAutoReport);
        System.out.println(b1.modelName + " " + b2.canAutoReport);
        System.out.println("All "+BlackBox.canAutoReport);

        b1.autoReport();
    }
}
