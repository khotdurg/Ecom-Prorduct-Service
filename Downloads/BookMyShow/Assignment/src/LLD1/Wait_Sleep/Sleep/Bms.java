package LLD1.Wait_Sleep.Sleep;

public class Bms {
    public static void main(String[] args) {
            try {
                for(int i =1; i<=5; i++) {
                    System.out.print(i+" ");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
    }
}

