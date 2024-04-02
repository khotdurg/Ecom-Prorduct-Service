package LLD1.Lamda.Example1;

public class Main {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running in Runnable thread");
            }
        };
        runnable.run();

        System.out.println("Running in Main thread");
    }
}
