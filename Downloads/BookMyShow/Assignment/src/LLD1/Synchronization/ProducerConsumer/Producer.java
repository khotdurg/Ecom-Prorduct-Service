package LLD1.Synchronization.ProducerConsumer;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    Semaphore semaphoreProducer;
    Semaphore semaphoreConsumer;

    public Producer(Semaphore semaphoreProducer, Semaphore semaphoreConsumer) {
        this.semaphoreProducer = semaphoreProducer;
        this.semaphoreConsumer = semaphoreConsumer;
    }

    @Override
    public void run() {
        for (int i =1; i<=5; i++){
            try{
                semaphoreProducer.acquire();
                System.out.println("Produced = "+ i);
                semaphoreConsumer.release();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
