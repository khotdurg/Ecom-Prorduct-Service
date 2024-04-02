package LLD1.Thread.Daemon;

public class Word extends Thread{
    @Override
    public void run() {
        if(Thread.currentThread().isDaemon()){
            System.out.println("daemon thread");
        }
        else{
            System.out.println("child thread");
        }

    }
}
