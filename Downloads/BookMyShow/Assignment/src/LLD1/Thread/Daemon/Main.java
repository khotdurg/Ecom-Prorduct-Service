package LLD1.Thread.Daemon;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main Thread");
        Word w = new Word();
        w.setDaemon(true);
        w.start();
    }
}
