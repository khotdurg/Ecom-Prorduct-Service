package LLD1.Concurrency.Callable;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<String> data = executorService.submit(new Demo());
        System.out.println(data.get());
        executorService.shutdown();
    }
}
