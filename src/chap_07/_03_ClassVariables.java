package chap_07;

public class _03_ClassVariables {
    public static void main(String[] args) {

        BlackBox b1 = new BlackBox();
        b1.modelName = "까망";
        BlackBox b2 = new BlackBox();
        b2.modelName = "하양";

        System.out.println(b1.modelName + " " + b1.canAutoReport);
        System.out.println(b1.modelName + " " + b2.canAutoReport);
        System.out.println("All "+BlackBox.canAutoReport);

        b1.autoReport();
    }
}
