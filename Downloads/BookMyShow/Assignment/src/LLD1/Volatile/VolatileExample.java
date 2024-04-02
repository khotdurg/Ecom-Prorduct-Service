package LLD1.Volatile;

public class VolatileExample {
    private volatile int count = 0;

    public void incrementCount() {
        count++;
    }

    public void displayCount() {
        System.out.println("Count: " + count);
    }
}
