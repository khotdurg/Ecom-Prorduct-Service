package LLD1.Concurrency.Executor;

public class Main {
    public static void main(String[] args) {
        for(int i =1; i<10; i++){
            ExecutorDemo executorDemo = new ExecutorDemo(i);
            Thread t = new Thread(executorDemo);
            t.start();
        }
    }
}
