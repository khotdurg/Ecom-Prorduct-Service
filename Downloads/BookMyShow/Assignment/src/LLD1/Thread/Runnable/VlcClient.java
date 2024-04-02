package LLD1.Thread.Runnable;

public class VlcClient {
    public static void main(String[] args) {
        Vlc vlc = new Vlc();
        Thread thread = new Thread(vlc);
        thread.start();
        System.out.println("dk");
        System.out.println(Thread.currentThread().getName());
    }
}
