package LLD1.Synchronization.ProducerConsumer;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore semaphoreProducer = new Semaphore(1);
        Semaphore semaphoreConsumer = new Semaphore(1);

        Producer producer = new Producer(semaphoreProducer, semaphoreConsumer);
        Consumer consumer = new Consumer(semaphoreConsumer, semaphoreProducer);

        Thread producerThread = new Thread(producer, "Producer Thread");
        Thread consumerThread = new Thread(consumer, "Consumer Thread");

        producerThread.start();
        consumerThread.start();
    }
}
