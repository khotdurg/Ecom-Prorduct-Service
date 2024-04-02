package LLD1.Wait_Sleep.Wait;

public class Test {
    static final Object lock = new Object();
    static class Thread1 extends Thread{
        @Override
        public void run() {
            synchronized (lock){
                try{
                    for(int i =1; i<=5; i++){
                        System.out.println("Thread 1 : "+ i);
                        lock.wait(1000); //wait for 1 second
                    }
                    System.out.println("Thread 1 is awake!");
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
    static class Thread2 extends Thread{
        public void run(){
            synchronized (lock){
                System.out.println("Thread 2 is notifying...");
                lock.notify();
            }
        }
    }

    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();

        thread1.start();
        thread2.start();
    }
}
