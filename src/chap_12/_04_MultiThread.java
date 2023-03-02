package chap_12;

public class _04_MultiThread {
    public static void main(String[] args) {
        Runnable cleanr1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("--- 직원 청소 시작, Runnable");
                for(int i = 1;  i <= 10 ; i+=2){
                    System.out.println("직원 " + i + "번방 청소 중, Runnable");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("--- 직원 청소 끝, Runnable");
            }
        };

        Runnable cleaner2 = ()->{
            System.out.println("--- 직원2 청소 시작, Runnable");
            for(int i = 2;  i <= 10 ; i+=2){
                System.out.println("직원2 " + i + "번방 청소 중, Runnable");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("--- 직원2 청소 끝, Runnable");
        };

        Thread t1 = new Thread(cleanr1);
        Thread t2 = new Thread(cleaner2);

        t1.start();
        t2.start();
    }
}
