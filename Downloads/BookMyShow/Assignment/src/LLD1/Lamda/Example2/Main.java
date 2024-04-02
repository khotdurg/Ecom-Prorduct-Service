package LLD1.Lamda.Example2;

public class Main {
    public static void main(String[] args) {
        Runnable runnable =() -> System.out.println("Running in Runnable thread");
        runnable.run();

        System.out.println("Running in Main thread");
    }
}
