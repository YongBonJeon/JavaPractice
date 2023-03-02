package chap_11;

public class _05_TryWithResources {
    public static void main(String[] args) {
        MyFileWriter writer1 = null;
        try{
            writer1 = new MyFileWriter();
            writer1.write("아이스크림이 먹고 싶다");
        } catch(Exception e){
            e.printStackTrace();
        } finally {
            try{
                writer1.close();
            } catch(Exception e){
                throw new RuntimeException(e);
            }
        }

        System.out.println("-----");

        // resource를 함께 사용했더니 자동으로 close 메소드를 호출했다.
        // AutoCloseable(close 메소드)을 구현해야함!
        try(MyFileWriter writer2 = new MyFileWriter()){
            writer2.write("빵이 먹고 싶다");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

class MyFileWriter implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("파일을 정상 종료합니다");
    }

    public void write(String line){
        System.out.println("파일에 내용을 입력합니다");
        System.out.println("입력 내용 : "+line);
    }
}
