package LLD1.Concurrency.ThreadPool;

public class Bms implements Runnable{
    int n ;
    public Bms(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        System.out.println(n +" Printed by : thread"+Thread.currentThread().getName());
    }
}
