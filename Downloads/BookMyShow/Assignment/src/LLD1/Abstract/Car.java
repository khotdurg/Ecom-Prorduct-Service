package LLD1.Abstract;

public class Car extends Vehicle{
    @Override //abstract should be override
    void start() {
        System.out.println("Start with key");
    }
}
