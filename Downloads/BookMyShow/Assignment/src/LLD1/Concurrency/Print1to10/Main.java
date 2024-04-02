package LLD1.Concurrency.Print1to10;

public class Main {
    public static void main(String[] args) {
        for (int i =1; i<=5; i++){
            Demo demo = new Demo(i);
            Thread t = new Thread(demo);
            t.start();
        }
    }
}
