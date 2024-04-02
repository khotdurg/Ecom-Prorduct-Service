package LLD1.Concurrency.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5) ;
        for(int i =1; i<=10; i++){
            Bms bms = new Bms(i);
            executorService.execute(bms);
        }

    }
}
