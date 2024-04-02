package LLD1.DesignPattern.Singleton;

public class User {
    public static void main(String[] args) {
        Car car1 = Car.getCar(); //object 1
        System.out.println(car1);

        Car car2 = Car.getCar(); //object 2
        System.out.println(car2);

        //object 1 and object 2  pointing out the same memory location means our code creating only 1 object
    }
}
