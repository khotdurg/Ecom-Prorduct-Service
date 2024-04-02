package LLD1.Concurrency.Executor;

public class ExecutorDemo implements Runnable{
    int abc;
    public ExecutorDemo(int abc) {
        this.abc = abc;
    }

    @Override
    public void run() {
        System.out.println("printed by threads: "+ Thread.currentThread().getName()+"=>"+abc);
    }
}
