package LLD1.RoughUse;


public class Main {
    public static void main(String[] args) {


        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("india");
        System.out.println(Thread.currentThread().getName());

    }
}
