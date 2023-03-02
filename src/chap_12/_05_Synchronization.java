package chap_12;

import chap_12.clean.Room;

public class _05_Synchronization {
    public static void main(String[] args) {
        Room room = new Room();
        Runnable cleanr1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("--- 직원 청소 시작, Runnable");
                for(int i = 1;  i <= 5 ; i++){
                    room.clean("직원1");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    if(i == 2){
                        throw new RuntimeException("수고 못함");
                    }
                }
                System.out.println("--- 직원 청소 끝, Runnable");
            }
        };

        Runnable cleaner2 = ()->{
            System.out.println("--- 직원2 청소 시작, Runnable");
            for(int i = 1;  i <= 5 ; i++){
                room.clean("직원2");

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
