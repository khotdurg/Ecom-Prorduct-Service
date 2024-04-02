package LLD1.Wait;

import java.util.concurrent.locks.Lock;

public class Test2 {
    static final Object lock = new Object();

    public static class Thread1 extends Thread {
        @Override
        public void run() {
            synchronized (lock){
                try {
                    for(int i =1; i<10; i++){
                        System.out.println(i);
                        lock.wait(1000);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static class Thread2 extends Thread{
        @Override
        public void run() {
            synchronized (lock){
                System.out.println("Thread 2 notified");
                lock.notify();
            }
        }
    }

    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}
