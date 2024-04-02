package LLD1.RoughUse;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test implements Runnable {
    private int n;

    public Test(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        for(int i =1;i<=5; i++){
            Test t = new Test(i);
            Thread thread = new Thread(t);
            thread.start();
        }
    }   
}

