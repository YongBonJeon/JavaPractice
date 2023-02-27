package chap_07;

public class BlackBox {
    String modelName;
    String resolution;
    int price;
    String color;
    int serialNumber;
    static int counter = 0;
    static boolean canAutoReport = false;

    BlackBox(){
        //this(~~);
        /*System.out.println("기본 생성자");
        this.serialNumber = ++counter;
        System.out.println("새로운 시리얼 넘버 " + this.serialNumber);
*/
    }
    BlackBox(String modelName, String resolution, int price, String color){
        // 기본 생성자
        /*this();
        System.out.println("사용자 정의 생성자");
        this.modelName = modelName;
        this.resolution = resolution;
        this.price = price;
        this.color = color;*/
    }

    void autoReport(){
        if(canAutoReport)
            System.out.println("Auto Report!");
        else
            System.out.println("No");
    }

    void insertMemoryCard(int capacity){
        System.out.println("insert!");
        System.out.println("용량 " + capacity);
    }

    void record(boolean showDateTime, boolean showSpeed, int min){
        System.out.println("녹화");
        if(showDateTime)
            System.out.println("날짜정보");
        if(showSpeed)
            System.out.println("속도정보");
        System.out.println(min + "분");
    }
    void record(){
        System.out.println("녹화");
        System.out.println("날짜정보");
        System.out.println("속도정보");
        System.out.println("5분");
    }

    static void callServiceCenter(){
        System.out.println("서비스 센터로 연결");

        // modelname = "test";
        //canAutoReport = false;
    }

    void appendModelName(String modelName) {
        // 인스턴스 변수 명시
        this.modelName += modelName;
    }

    String getModelName(){
        return modelName;
    }
    void setModelName(String modelName){
        this.modelName = modelName;
    }

    String getResolution(){
        if(resolution == null || resolution.isEmpty()){
            return "판매자 문의";
        }
        return resolution;
    }

    int getPrice(){
        return price;
    }
    void setPrice(int price){
        if(price < 1000) {
            this.price = 1000;
        }
        else
            this.price = price;
        //System.out.println(this.price);
    }

    String getColor(){
        return color;
    }

    void setColor(String color){
        this.color = color;
    }
}
