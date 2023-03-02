package chap_12;

import chap_12.clean.CleanRunnable;

public class _03_Join {
    public static void main(String[] args) {
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);
        thread.start();

        // join ~ wait
        try {
            thread.join(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        cleanByBoss();

    }

    public static void cleanByBoss(){
        System.out.println("--- 혼자 청소 시작");
        for(int i = 1;  i <= 10 ; i+=2){
            System.out.println("혼자 " + i + "번방 청소 중");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("--- 혼자 청소 끝");
    }
}
