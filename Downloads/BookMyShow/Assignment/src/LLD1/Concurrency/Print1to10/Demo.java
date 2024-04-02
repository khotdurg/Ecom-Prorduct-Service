package LLD1.Concurrency.Print1to10;

public class Demo implements Runnable{
    int print;
    Demo(int print){
        this.print=print;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
